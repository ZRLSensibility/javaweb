package com.test;

import com.utils.JdbcUtils;
import org.junit.Test;

import java.sql.Connection;

/**
 * @author ZRL
 * @create 2021-08-18 17:40
 */
public class JdbcUtilsTest {
    @Test
    public void test(){

        for (int i = 0; i < 100; i++) {
            Connection conn = JdbcUtils.getConnection();
            System.out.println(conn);
            JdbcUtils.close(conn);
        }
    }
}
