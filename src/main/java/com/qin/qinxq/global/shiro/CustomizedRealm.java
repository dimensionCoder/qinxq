package com.qin.qinxq.global.shiro;

import com.qin.qinxq.entity.realm.Realm;
import com.qin.qinxq.entity.user.User;
import com.qin.qinxq.global.Assert.Assert;
import com.qin.qinxq.global.Config;
import com.qin.qinxq.global.MD5.MD5;
import com.qin.qinxq.mvc.realm.dao.PermissionDao;
import com.qin.qinxq.mvc.realm.dao.RealmDao;
import com.qin.qinxq.mvc.user.dao.UserDao;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by qinxq on 2016/11/7 22:01
 */
public class CustomizedRealm extends AuthorizingRealm {
    @Autowired
    private UserDao userDao;
    @Autowired
    private RealmDao realmDao;
    @Autowired
    private PermissionDao permissionDao;
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        String principal=(String) principalCollection.getPrimaryPrincipal();
        SimpleAuthorizationInfo info=new SimpleAuthorizationInfo();
        return info;
    }

    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken usernamePasswordToken=(UsernamePasswordToken)authenticationToken;
        String username=usernamePasswordToken.getUsername();
        char[] chars=usernamePasswordToken.getPassword();
        if (Assert.isNull(chars)){
            return null;
        }
        String password=String.valueOf(chars);
        try {
            for (int i = Config.MD5_FOR_PASSWORD; i>0; i--){
                password= MD5.getSimpleMD5(password);
            }
        }catch (Exception e){
            throw new RuntimeException("加密密码失败");
        }
        User user=userDao.login(new User(username,password));
        if(user != null){

            return new SimpleAuthenticationInfo(user.getId(),password,"");
        }
        return null;
    }
}
