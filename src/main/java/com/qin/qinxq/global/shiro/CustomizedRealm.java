package com.qin.qinxq.global.shiro;

import com.qin.qinxq.entity.user.User;
import com.qin.qinxq.global.Config;
import com.qin.qinxq.global.MD5.MD5;
import com.qin.qinxq.mvc.user.dao.UserDao;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by qinxq on 2016/11/7 22:01
 */
public class CustomizedRealm extends AuthorizingRealm {
    @Autowired
    private UserDao userDao;
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken usernamePasswordToken=(UsernamePasswordToken)authenticationToken;
        String account=usernamePasswordToken.getUsername();
        String password=String.valueOf(usernamePasswordToken.getPassword());
        try {
            for (int i = Config.MD5_FOR_PASSWORD; i>0; i--){
                password= MD5.getSimpleMD5(password);
            }
        }catch (Exception e){
            throw new RuntimeException("加密密码失败");
        }
        User user=userDao.login(new User(account,password));
        if(user != null){
        }
        return null;
    }
}
