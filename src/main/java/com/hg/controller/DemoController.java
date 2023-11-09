package com.hg.controller;

import com.alibaba.fastjson2.JSONObject;
import com.hg.pojo.User;
import com.hg.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("user")
public class DemoController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public JSONObject login(User user) {
        JSONObject res = new JSONObject();
        try {
            User resUser = userService.findOne(user);
            res.put("code", "0000");
            res.put("msg", "success");
            res.put("data", resUser);
        } catch (Exception e) {
            e.printStackTrace();
            res.put("code", "9999");
            res.put("msg", "err");
        }
        return res;
    }

    @RequestMapping("/registry")
    public JSONObject registry(User user) {
        JSONObject res = new JSONObject();
        try {
            User u = userService.checkReg(user.getUsername());
            if (u == null) { // 如果用户名不存在
                userService.addOne(user); // 调用UserService的addOne方法进行用户注册
                res.put("code", "0000");
                res.put("msg", "success");
            }
        } catch (Exception e) {
            e.printStackTrace();
            res.put("code", "9999");
            res.put("msg", "err");
        }
        return res;
    }
}
