import baseTest.BaseTest;
import com.qin.qinxq.entity.realm.Realm;
import com.qin.qinxq.mvc.realm.dao.RealmDao;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by qinxq on 2016/11/8 0:04
 */
public class RealmTest extends BaseTest{
    @Autowired
    private RealmDao realmDao;
    @Test
    public void insertTest(){
        Realm realm=new Realm();
        realm.setRealmname("游客");
        int count=realmDao.insert(realm);
        write(count);
    }
    @Test
    public void queryAllTest(){
        List<Realm> list=realmDao.queryAll();
        for(Realm realm:list){
            write(realm.getRealmname()+realm.getId());
        }
    }
    @Test
    public void selectTest(){
        realmDao.select(new Realm());
    }
    @Test
    public void deleteTest(){
        realmDao.delete(new Realm());
    }
}
