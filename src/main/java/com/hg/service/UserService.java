package com.hg.service;

import com.hg.pojo.User;


public interface UserService {
    User findOne(User user);
    int addOne(User user);
    User checkReg(String username);
}

