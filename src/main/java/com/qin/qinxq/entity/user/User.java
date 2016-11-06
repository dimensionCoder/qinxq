package com.qin.qinxq.entity.user;

import com.qin.qinxq.entity.baseentity.Entity;

/**
 * Created by qinxq on 2016/10/23 19:41
 */
public class User extends Entity{
    private String id;
    private String username;
    private String password;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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
