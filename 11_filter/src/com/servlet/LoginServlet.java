package com.servlet;

import sun.rmi.server.UnicastServerRef;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author ZRL
 * @create 2021-09-06 16:19
 */
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        if("zrl123".equals(username) && "123456".equals(password)){
            req.getSession().setAttribute("user", username);
           resp.getWriter().write("登录成功！");
        }else {
            req.getRequestDispatcher("/login.jsp").forward(req,resp);
        }

    }
}
