package com.web;

import com.pojo.User;
import com.service.UserService;
import com.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/** 已经优化，不使用
 * @author ZRL
 * @create 2021-08-18 20:46
 */
public class LoginServlet extends HttpServlet {

    private UserService userService = new UserServiceImpl();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        User login = userService.login(new User(null, username, password, null));

        if(login == null){
            req.setAttribute("msg","用户名或密码错误");
            req.setAttribute("username", username);
            req.getRequestDispatcher("/pages/user/login.jsp").forward(req,resp);
        }else {
            req.getRequestDispatcher("/pages/user/login_success.jsp").forward(req,resp);
        }


    }
}
