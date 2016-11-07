import baseTest.BaseTest;
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
public class MybatisTest extends BaseTest{
    @Autowired
    private UserDao userDao;
    @Test
    public void queryAllTest(){
        List<User> list=userDao.queryAll();
        for(User user:list){
            write("/**************************************************/");
            System.out.println(user.getId());
            System.out.println(user.getUsername());
            System.out.println(user.getPassword());
            write("/**************************************************/");
        }
    }

    @Test
    public void deleteTest(){
        int count=userDao.delete(new User());
        write(count);
    }
    @Test
    public void updateTest(){
        int count=userDao.update(new User());
        write(count);
    }
    @Test
    public void insertTest(){
        User user=new User();
        user.setUsername("qinxq123");
        user.setPassword("pwd180461244");
        int count=userDao.insert(user);
        write(count);
    }
}
