package com.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author ZRL
 * @create 2021-08-09 18:31
 */
public class ContextServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ServletContext context = getServletConfig().getServletContext();
        String username = context.getInitParameter("username");
        System.out.println("context-param参数username的值是:" + username );
        System.out.println("context-param参数username的值是:" + context.getInitParameter("password") );

        System.out.println("当前工程路径：" + context.getContextPath());

        System.out.println("工程部署的路径是:" + context.getRealPath("/"));

        System.out.println("工程下css目录的绝对路径是:" + context.getRealPath("/css"));
    }
}
