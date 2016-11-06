import com.qin.qinxq.entity.user.User;
import com.qin.qinxq.mvc.basemvc.dao.BaseDao;
import com.qin.qinxq.mvc.user.dao.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by qinxq on 2016/11/5 22:48
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring-mybatis.xml"})
public class MybatisTest {
    @Autowired
    private UserDao userDao;
    @Test
    public void mybatisTest(){
        List<User> list=userDao.queryAll();
        for(User user:list){
            System.out.println(user.getId());
            System.out.println(user.getUsername());
            System.out.println(user.getPassword());
        }
    }
}
