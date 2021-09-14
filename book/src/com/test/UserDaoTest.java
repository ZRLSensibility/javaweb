package com.test;

import com.dao.UserDao;
import com.dao.impl.UserDaoImpl;
import com.pojo.User;
import org.junit.Test;

/**
 * @author ZRL
 * @create 2021-08-18 18:47
 */
public class UserDaoTest {
    UserDaoImpl userDao = new UserDaoImpl();
    @Test
    public void queryUserByUsername(){
        if(userDao.queryUserByUsername("admin") == null){
            System.out.println("用户名可用！");
        }else{
            System.out.println("用户名已存在！");
        }
    }
    @Test
    public void queryUserByUsernameAndPassword(){
        if(userDao.queryUserByUsernameAndPassword("admin","admin") == null){
            System.out.println("用户名或密码错误，登陆失败");
        }else{
            System.out.println("查询成功");
        }
    }
    @Test
    public void saveUser(){
        System.out.println(userDao.saveUser(new User(null,"zrl123","123456","1440618745@qq.com")));
    }
}
