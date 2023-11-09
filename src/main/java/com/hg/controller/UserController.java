package com.hg.controller;

import com.hg.pojo.User;
import com.hg.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class UserController {
    @Resource
    private UserService userService; // 创建UserService对象

    @RequestMapping("/golog") // 处理"/golog"请求
    public String log(User user, Model model) { // 登录方法，传入User对象和Model对象作为参数
        User u = userService.findOne(user); // 调用UserService的findOne方法查询用户信息
        model.addAttribute("user", u); // 将查询到的用户信息添加到Model中
        if (u != null) { // 如果查询到用户信息不为空
            return "logok"; // 返回"logok"视图
        } else
            return "logno"; // 否则返回"logno"视图
    }


    @RequestMapping("/goreg") // 处理"/goreg"请求
    public String reg(User user) { // 注册方法，传入User对象作为参数
        User u = userService.checkReg(user.getUsername()); // 调用UserService的checkReg方法检查用户名是否已存在
        if (u == null) { // 如果用户名不存在
            userService.addOne(user); // 调用UserService的addOne方法进行用户注册
            return "regok"; // 返回"regok"视图
        }
        return "regno"; // 否则返回"regno"视图
    }
}

