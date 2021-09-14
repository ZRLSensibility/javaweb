package com.service;

import com.pojo.User;

/**
 * @author ZRL
 * @create 2021-08-18 18:58
 */
public interface UserService {
    /**
     * 注册用户
     * @param user
     */
    public void registUser(User user);

    /**
     * 登录
     * @param user
     * @return
     */
    public User login(User user);

    /**
     * 检查用户名是否可用
     * @param username
     * @return 返回true用户名已存在，false用户名可用
     */
    public boolean existUsername(String username);

}
