package com.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author ZRL
 * @create 2021-09-06 18:30
 */
public class Filter2 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Filter2 前置代码");
        System.out.println("Filter2的线程：" + Thread.currentThread().getName());
        System.out.println("Filter2:" + servletRequest.getParameter("username"));
        System.out.println("Filter2取Filter1中保存的数据是：" + servletRequest.getAttribute("key1"));
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("Filter2的线程：" + Thread.currentThread().getName());
        System.out.println("Filter2 后置代码");
    }

    @Override
    public void destroy() {

    }
}
