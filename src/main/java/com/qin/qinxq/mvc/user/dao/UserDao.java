package com.qin.qinxq.mvc.user.dao;

import com.qin.qinxq.entity.user.User;
import com.qin.qinxq.mvc.basemvc.dao.BaseDao;

/**
 * Created by qinxq on 2016/11/6 15:19
 */
public interface UserDao extends BaseDao<User> {
    void newUser(User user);
    User login(User user);
}
