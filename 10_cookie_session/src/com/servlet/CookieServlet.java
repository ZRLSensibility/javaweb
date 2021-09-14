package com.servlet;

import com.utils.CookieUtils;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author ZRL
 * @create 2021-09-02 23:27
 */
public class CookieServlet extends BaseServlet {
    protected void testPath(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie = new Cookie("path1","path1");

        cookie.setPath(req.getContextPath() + "/abc");
        resp.addCookie(cookie);
        resp.getWriter().write("创建了一个带有Path路径的cookie");

    }
    protected void updateCookie(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //方案一：
//        Cookie cookie = new Cookie("key1","newvalue1");
//
//        resp.addCookie(cookie);


        //方案二：

        Cookie cookie = CookieUtils.findCookie("key2",req.getCookies());
        if(cookie != null){
            cookie.setValue("newvalue2");

            resp.addCookie(cookie);
        }

        resp.getWriter().write("key1的cookie已经修改好");
    }
    protected void life3600(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie = new Cookie("life360","life360");
        cookie.setMaxAge(60 * 60);
        resp.addCookie(cookie);

        resp.getWriter().write("已经创建了一个存活一个小时的cookie");

    }
    protected void deleteNow(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie = CookieUtils.findCookie("key2", req.getCookies());
        if(cookie != null){
            cookie.setMaxAge(0);
            resp.addCookie(cookie);

            resp.getWriter().write("key2的cookie已经被删除");
        }
    }
    protected void defaultLIfe(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie = new Cookie("defaultLife","defaultLife");
        cookie.setMaxAge(-1);
        resp.addCookie(cookie);

    }
    protected void getCookie(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] cookies = req.getCookies();

        for (Cookie cookie : cookies) {
            resp.getWriter().write("Cookie[" + cookie.getName() + "=" + cookie.getValue() + "] <br/>");
        }



//        Cookie iWantCookie = null;
        Cookie iWantCookie = CookieUtils.findCookie("key1", cookies);

//        for (Cookie cookie : cookies) {
//            if("key1".equals(cookie.getName())){
//                iWantCookie = cookie;
//                break;
//            }
//        }

        if(iWantCookie != null){
            resp.getWriter().write("找到需要的cookie");
        }
    }

    protected void createCookie(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie = new Cookie("key1","value1");

        resp.addCookie(cookie);

        Cookie cookie1 = new Cookie("key2","value2");

        resp.addCookie(cookie1);

        Cookie cookie2 = new Cookie("key3","value3");

        resp.addCookie(cookie2);

        resp.getWriter().write("Cookie创建成功");

    }
}
