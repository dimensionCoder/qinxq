package com.qin.qinxq.entity.user;

import com.qin.qinxq.entity.baseentity.Entity;

/**
 * Created by qinxq on 2016/10/23 19:41
 */
public class User extends Entity{
    /*用户名*/
    private String username;
    /*密码*/
    private String password;
    /*昵称*/
    private String nickname;
    /*角色*/
    private int realm;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
