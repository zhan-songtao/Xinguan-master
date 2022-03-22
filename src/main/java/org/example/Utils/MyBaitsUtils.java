package org.example.Utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MyBaitsUtils {

      private static SqlSessionFactory sqlSessionFactory;


     static {
         try {
             String resource = "Configuration.xml";
             InputStream inputStream = Resources.getResourceAsStream(resource);

             sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
         } catch (IOException e) {
             e.printStackTrace();
         }
     }

    public MyBaitsUtils() throws IOException {
    }


    public static SqlSession getSqlSession(){

        return sqlSessionFactory.openSession();
    }
}
