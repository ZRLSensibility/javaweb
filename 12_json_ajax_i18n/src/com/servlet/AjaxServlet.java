package com.servlet;

import com.google.gson.Gson;
import com.pojo.Person;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLOutput;

/**
 * @author ZRL
 * @create 2021-09-08 23:57
 */
public class AjaxServlet extends BaseServlet {

    protected void jqueryAjax(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("jqueryAjax请求过来了");

        Person person = new Person(1,"张瑞龙");
        Gson gson = new Gson();
        String ajaxJsonString = gson.toJson(person);

        resp.getWriter().write(ajaxJsonString);


    }

    protected void javaScriptAjax(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("javaScriptAjax请求过来了");

        Person person = new Person(1,"张瑞龙");
        Gson gson = new Gson();
        String ajaxJsonString = gson.toJson(person);

        resp.getWriter().write(ajaxJsonString);


    }

    protected void jqueryGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("jqueryGet请求过来了");

        Person person = new Person(1,"张瑞龙");
        Gson gson = new Gson();
        String ajaxJsonString = gson.toJson(person);

        resp.getWriter().write(ajaxJsonString);


    }

    protected void jqueryPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("jqueryPost请求过来了");

        Person person = new Person(1,"张瑞龙");
        Gson gson = new Gson();
        String ajaxJsonString = gson.toJson(person);

        resp.getWriter().write(ajaxJsonString);


    }

    protected void getJSON(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("getJSON请求过来了");

        Person person = new Person(1,"张瑞龙");
        Gson gson = new Gson();
        String ajaxJsonString = gson.toJson(person);

        resp.getWriter().write(ajaxJsonString);


    }

    protected void jquerySerialize(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("jquerySerialize请求过来了");

        System.out.println("用户名：" + req.getParameter("username"));
        System.out.println("密码：" + req.getParameter("password"));

        Person person = new Person(1,"张瑞龙");
        Gson gson = new Gson();
        String ajaxJsonString = gson.toJson(person);

        resp.getWriter().write(ajaxJsonString);


    }
}
