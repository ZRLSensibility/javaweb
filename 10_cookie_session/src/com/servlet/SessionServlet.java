package com.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author ZRL
 * @create 2021-09-04 22:58
 */
public class SessionServlet extends BaseServlet {
    protected void deleteNow(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        session.invalidate();;

        resp.getWriter().write("Session已经设置为超时");
    }
    protected void life3(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        session.setMaxInactiveInterval(3);

        resp.getWriter().write("当前Session已经设置为3秒超时");
    }
    protected void getAttribute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Object attribute = req.getSession().getAttribute("key1");
        resp.getWriter().write("从Session中获取出key1的数据是：" + attribute);
    }
    protected void defaultLife(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int maxInactiveInterval = req.getSession().getMaxInactiveInterval();
        resp.getWriter().write("Session的默认超时时长为" + maxInactiveInterval + "秒");
    }
    protected void setAttribute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getSession().setAttribute("key1","value1");
        resp.getWriter().write("已经往Session中保存了数据");

    }
    protected void createOrGetSession(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        boolean isNew = session.isNew();
        String id = session.getId();

        resp.getWriter().write("得到的Session，它的id是" + id + "<br/>");
        resp.getWriter().write("这个Session是否是心创建的：" + isNew + "<br/>");
    }
}
