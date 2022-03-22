package org.example;

import org.apache.ibatis.session.SqlSession;
import org.example.Utils.MyBaitsUtils;
import org.example.pojo.User;
import org.example.zhan.UserDao;
import org.junit.Test;

import java.util.List;

public class MyTest {

   @Test
    public void test(){

       SqlSession sqlSession = MyBaitsUtils.getSqlSession();

       UserDao mapper = sqlSession.getMapper(UserDao.class);

       List<User> userList=mapper.getUserList();

       for (User user : userList) {
           System.out.println(user);
       }

       sqlSession.close();

   }




}
