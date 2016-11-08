package com.qin.qinxq.mvc.user.service;

import com.qin.qinxq.entity.user.User;
import com.qin.qinxq.mvc.basemvc.service.BaseService;

/**
 * Created by qinxq on 2016/11/7 22:08
 */
public interface UserService extends BaseService{
    void newUser(User user);
    User login(User user);
}
