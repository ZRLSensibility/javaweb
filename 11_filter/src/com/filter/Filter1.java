package com.filter;

import javax.servlet.*;
import java.io.DataOutput;
import java.io.IOException;

/**
 * @author ZRL
 * @create 2021-09-06 18:30
 */
public class Filter1 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Filter1 前置代码");
        System.out.println("Filter1的线程：" + Thread.currentThread().getName());
        System.out.println("Filter1:" + servletRequest.getParameter("username"));
        servletRequest.setAttribute("key1","value1");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("Filter1的线程：" + Thread.currentThread().getName());
        System.out.println("Filter1 后置代码");
    }

    @Override
    public void destroy() {

    }
}
