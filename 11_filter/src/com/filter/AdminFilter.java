package com.filter;

import javafx.scene.control.Alert;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author ZRL
 * @create 2021-09-06 12:19
 */
public class AdminFilter implements Filter {
    public AdminFilter() {
        System.out.println("1.Filter构造器方法AdminFilter()");
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("2.Filter的init(FilterConfig filterConfig)初始化");

        System.out.println("filter-name的值是：" + filterConfig.getFilterName());

        System.out.println("初始化参数username的值是：" + filterConfig.getInitParameter("username"));
        System.out.println("初始化参数url的值是：" + filterConfig.getInitParameter("url"));

        System.out.println(filterConfig.getServletContext());
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("3.Filter的doFilter()初始化");
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;

        HttpSession session = httpServletRequest.getSession();
        Object user = session.getAttribute("user");

        if(user == null){
            servletRequest.getRequestDispatcher("/login.jsp").forward(servletRequest,servletResponse);
        }else {
            //让程序继续往下访问用户的目标资源
            filterChain.doFilter(servletRequest,servletResponse);
        }

    }

    @Override
    public void destroy() {
        System.out.println("4.Filter的destroy()销毁");
    }
}
