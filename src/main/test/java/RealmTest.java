import baseTest.BaseTest;
import com.qin.qinxq.entity.realm.Realm;
import com.qin.qinxq.mvc.realm.dao.RealmDao;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by qinxq on 2016/11/8 0:04
 */
public class RealmTest extends BaseTest{
    @Autowired
    private RealmDao realmDao;
    @Test
    public void insertTest(){
        write(realmDao.queryAll().size());
        for (Realm realm:realmDao.queryAll()){
            write(realm.getRealmname());
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
