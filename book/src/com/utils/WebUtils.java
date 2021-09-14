package com.utils;

import com.pojo.User;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @author ZRL
 * @create 2021-09-02 22:04
 */
public class WebUtils {
    public static <T> T copyParamToBean(Map value, T bean){
        try {
            System.out.println("注入之前：" + bean);
            BeanUtils.populate(bean,value);
            System.out.println("注入之后：" + bean);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bean;
    }
}
