package com.bjpowernode.Dtuil;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SessionUtil {
    private static SqlSessionFactory sqlSessionFactory;
    private static ThreadLocal<SqlSession> t = new ThreadLocal<>();
    static {
        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }
    public static SqlSession getSession(){
        SqlSession session = null;
        session = t.get();
        if (session == null){
            session = sqlSessionFactory.openSession();
            t.set(session);
        }
        return session;
    }
    public static void myClose(SqlSession session){
        session.close();
        t.remove();
    }
}
