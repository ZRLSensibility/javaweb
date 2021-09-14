package com.servlet;

import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpsServer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author ZRL
 * @create 2021-08-15 20:30
 */
public class ResponseIOServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //System.out.println(resp.getCharacterEncoding());

//        resp.setCharacterEncoding("utf-8");

        //通过响应头，设置浏览器也使用utf-8字符集
//        resp.setHeader("Content-Type","text/html;charset=utf-8");

        resp.setContentType("text/html;charset=utf-8");
        System.out.println(resp.getCharacterEncoding());

        PrintWriter writer = resp.getWriter();
        writer.println("张瑞龙的程序!!!");

    }
}
