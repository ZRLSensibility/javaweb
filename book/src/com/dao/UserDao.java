package com.dao;

import com.pojo.User;

/**
 * @author ZRL
 * @create 2021-08-18 18:22
 */
public interface UserDao {



    /**
     * 根据用户名查询用户信息
     * @param username 用户名
     * @return 如果返回null，说明没有这个用户
     */
     public User queryUserByUsername(String username);

    /**
     * 根据用户名和密码查询用户信息
     * @param username
     * @param password
     * @return
     */
     public User queryUserByUsernameAndPassword(String username,String password);

    /**
     * 保存用户信息
     * @param user
     * @return 返回-1失败
     */
     public int saveUser(User user);
}
