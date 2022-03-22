package org.example.zhan;

import org.example.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserDao {

       List<User> getUserList();

       int addUser(User user);

       int addUser2(Map<String,Object> map);

       int deleteUser(int id);

       int updateUser(User user);




}
