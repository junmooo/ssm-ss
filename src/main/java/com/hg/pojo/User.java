package com.hg.pojo;

public class User {
    private String username; // 用户名
    private String userpwd; // 用户密码

    public String getUsername() { // 获取用户名
        return username;
    }

    public void setUsername(String username) { // 设置用户名
        this.username = username;
    }

    public String getUserpwd() { // 获取用户密码
        return userpwd;
    }

    public void setUserpwd(String userpwd) { // 设置用户密码
        this.userpwd = userpwd;
    }

    @Override
    public String toString() {
        return "User [username=" + username + ", userpwd=" + userpwd + "]";
    }

}
