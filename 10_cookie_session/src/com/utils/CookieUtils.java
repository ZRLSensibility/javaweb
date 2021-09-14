package com.utils;

import javax.servlet.http.Cookie;
import java.text.CollationKey;

/**
 * @author ZRL
 * @create 2021-09-03 10:50
 */
public class CookieUtils {
    public static Cookie findCookie(String name,Cookie[] cookies){
        if(name == null || cookies == null || cookies.length == 0){
            return null;
        }
        for (Cookie cookie : cookies) {
            if(name.equals(cookie.getName())){
                return cookie;
            }
        }
        return null;
    }
}
