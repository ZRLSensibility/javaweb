package com.i18n;

import org.junit.Test;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author ZRL
 * @create 2021-09-09 15:18
 */
public class I18nTest {
    @Test
    public void testLocale(){
        //获取系统默认的语言国家
//        Locale locale = Locale.getDefault();
//        System.out.println(locale);

        //所有国家国际化语言
//        for(Locale locale1 : Locale.getAvailableLocales()){
//            System.out.println(locale1);
//        }

        //获取中文
        System.out.println(Locale.CHINA);
        //获取英文
        System.out.println(Locale.US);


    }
    @Test
    public void testI18n(){
        Locale locale = Locale.CHINA;

        ResourceBundle bundle = ResourceBundle.getBundle("i18n", locale);

        System.out.println("username:" + bundle.getString("username"));
        System.out.println("password:" + bundle.getString("password"));
        System.out.println("sex:" + bundle.getString("sex"));
        System.out.println("age:" + bundle.getString("age"));

    }
}
