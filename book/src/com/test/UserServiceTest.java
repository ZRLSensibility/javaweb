package com.test;

import com.pojo.User;
import com.service.UserService;
import com.service.impl.UserServiceImpl;
import org.junit.Test;

/**
 * @author ZRL
 * @create 2021-08-18 19:06
 */
public class UserServiceTest {
    UserService userService = new UserServiceImpl();

    @Test
    public void registUser(){
        userService.registUser(new User(null,"lyp123","666666","1234@163.com"));
        userService.registUser(new User(null,"zzz123","666666","1234@163.com"));
    }
    @Test
    public void login(){
        System.out.println(userService.login(new User(null,"zzz123","666666","1234@163.com")));
    }
    @Test
    public void existUsername(){
        if(userService.existUsername("zzz123")){
            System.out.println("用户名已存在");
        }else{
            System.out.println("用户名可用");
        }
    }

}
