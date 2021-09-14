package com.test;

import java.lang.reflect.Method;

/**
 * @author ZRL
 * @create 2021-09-01 19:51
 */
public class UserServletTest {

    public void login(){
        System.out.println("这是login（）方法调用了");
    }
    public void regist(){
        System.out.println("这是regist（）方法调用了");
    }
    public void updateUser(){
        System.out.println("这是updateUser（）方法调用了");
    }
    public void updateUserPassword(){
        System.out.println("这是updateUserPassword（）方法调用了");
    }


    public static void main(String[] args) {
        String action = "login";
        try {
            Method method = UserServletTest.class.getDeclaredMethod(action);

            System.out.println(method);

            method.invoke(new UserServletTest());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
