package com.qin.qinxq.entity.user;

import com.qin.qinxq.entity.baseentity.Entity;

/**
 * Created by qinxq on 2016/11/7 22:15
 */
public class UserInformation extends Entity{
    /*引用user表的id作为外键*/
    String userid;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }
}
