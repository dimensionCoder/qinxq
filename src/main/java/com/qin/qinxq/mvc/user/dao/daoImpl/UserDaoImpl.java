package com.qin.qinxq.mvc.user.dao.daoImpl;

import com.qin.qinxq.entity.user.User;
import com.qin.qinxq.global.Config;
import com.qin.qinxq.global.MD5.MD5;
import com.qin.qinxq.global.tool.UUID;
import com.qin.qinxq.mvc.basemvc.dao.daoImp.BaseDaoImpl;
import com.qin.qinxq.mvc.user.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * Created by qinxq on 2016/11/6 15:21
 */
@Repository
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {
    /**
     * @Description 进入方法后获取uuid并会对密码进行加密,无需手动设置
     * @param user
     */
    public void newUser(User user) {
        user.setId(UUID.getOne());
        String pwd=user.getPassword();
        try {
            for (int i = Config.MD5_FOR_PASSWORD; i>0; i--){
                pwd=MD5.getSimpleMD5(pwd);
            }
        }catch (Exception e){
            throw new RuntimeException("加密密码失败");
        }
        user.setPassword(pwd);
        sqlSessionTemplate.insert("insert",user);
    }

    /**
     * @Description 直接根据参数进行查询,需自行为密码进行加密
     * @param user
     * @return
     */
    public User login(User user){
        return sqlSessionTemplate.selectOne("login",user);
    }
}
