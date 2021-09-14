package com.servlet;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.List;

/**
 * @author ZRL
 * @create 2021-08-23 16:05
 */
public class UploadServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("文件上传过来了");

//        ServletInputStream inputStream = req.getInputStream();
//
//        byte[] buffer = new byte[1024000];
//        int read = inputStream.read(buffer);
//        System.out.println(new String(buffer,0,read));

        //1.先判断上传的数据是否多段数据（是，才能文件上传）
        if(ServletFileUpload.isMultipartContent(req)){
            FileItemFactory fileItemFactory = new DiskFileItemFactory();
            ServletFileUpload servletFileUpload = new ServletFileUpload(fileItemFactory);

            try {
                List<FileItem> list = servletFileUpload.parseRequest(req);
                for(FileItem fileItem : list){
                    if(fileItem.isFormField()){
                        System.out.println("表单项的name属性值：" + fileItem.getFieldName());
                        System.out.println("表单项的value属性值：" + fileItem.getString("utf-8"));
                    }else {
                        System.out.println("表单项的name属性值：" + fileItem.getFieldName());
                        System.out.println("上传的文件夹：" + fileItem.getName());
                        fileItem.write(new File("e:\\" +  fileItem.getName()));
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
