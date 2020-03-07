package com.neuedu.service;//package com.neuedu.service;

import com.neuedu.pojo.User;

import java.util.List;

public interface UserService {
    List<User> getUsers(User user);
    List<User> getAll(User user);
    User getuserById(int id);
    int add(User user);
    int del(User user);
    int update(User user);

    User getUserByNameAndUserPwd(String userName,String userPwd);
}
