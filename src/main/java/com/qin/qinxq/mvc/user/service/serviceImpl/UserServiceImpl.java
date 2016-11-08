package com.qin.qinxq.mvc.user.service.serviceImpl;

import com.qin.qinxq.entity.user.User;
import com.qin.qinxq.mvc.basemvc.service.serviceImp.BaseServiceImpl;
import com.qin.qinxq.mvc.user.dao.UserDao;
import com.qin.qinxq.mvc.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by qinxq on 2016/11/7 22:08
 */
public class UserServiceImpl extends BaseServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;
    public void newUser(User user) {
        userDao.newUser(user);
    }

    public User login(User user) {
        return userDao.login(user);
    }
}
