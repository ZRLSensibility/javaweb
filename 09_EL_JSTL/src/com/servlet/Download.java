package com.servlet;

import org.apache.commons.io.IOUtils;
import sun.misc.BASE64Encoder;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Base64;

/**
 * @author ZRL
 * @create 2021-08-23 20:39
 */
public class Download extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.获取要下载的文件名
        String downloadFilename = "2.jpg";
        //2.读取要下载的文件内容
        ServletContext servletContext = getServletContext();
        //3.获取要下载的文件类型
        String mimeType = servletContext.getMimeType("/file/" + downloadFilename);
        System.out.println(mimeType);
        //4.再回传前，通过响应头告诉客户端返回的数据类型
        resp.setContentType(mimeType);
        //5.还要告诉客户端收到的数据是用于下载使用（还是使用响应头）
        //Content-Disposition响应头，表示收到的数据怎么处理
        //attachment表示附件

        if(req.getHeader("User-Agent").contains("Firefox")){
            //火狐浏览器解析中文
            resp.setHeader("Content-Disposition","attachment;filename==?utf-8?B?" + new BASE64Encoder().encode("中国.jpg".getBytes("utf-8")) + "?=");
        }else{
            //谷歌和IE浏览器解析中文
            resp.setHeader("Content-Disposition","attachment;filename=" + URLEncoder.encode("中国.jpg","utf-8"));
        }



        InputStream resourceAsStream = servletContext.getResourceAsStream("/file/" + downloadFilename);
        OutputStream outputStream = resp.getOutputStream();
        //6.把下载的文件内容回传给客户端
        IOUtils.copy(resourceAsStream,outputStream);



    }
}
