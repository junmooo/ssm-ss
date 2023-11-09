package com.hg.service.Impl;  // 声明包名 com.hg.service.Impl

import com.hg.service.UserService;  // 导入UserService接口

import org.springframework.stereotype.Service;  // 导入Spring的@Service注解

import com.hg.dao.UserMapper;  // 导入UserMapper类
import com.hg.pojo.User;  // 导入User类

import javax.annotation.Resource;  // 导入javax的@Resource注解

@Service  // 声明该类是一个服务类
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;  // 使用@Resource注解注入UserMapper对象

    @Override  // 重写接口中的方法
    public User findOne(User user) {
        return userMapper.findOne(user);  // 调用userMapper的findOne方法，查找用户
    }

    @Override  // 重写接口中的方法
    public int addOne(User user) {
        return userMapper.addOne(user);  // 调用userMapper的addOne方法，添加用户
    }

    @Override  // 重写接口中的方法
    public User checkReg(String username) {
        return userMapper.checkReg(username);  // 调用userMapper的checkReg方法，检查用户是否已注册
    }
}
