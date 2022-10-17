package com.malf.upp.utils;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * 封装计算sqltask的一些工具计算方法
 */
public class SqlTaskExecuteUtil {

    //封装一个可以读取指定的mybatis配置文件，构造sqlSessionFactory 的方法
    private static SqlSessionFactory createSqlSessionFactory(){
        String resource="mysql_config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        return sqlSessionFactory;
    }
}
