import baseTest.BaseTest;
import com.qin.qinxq.global.MD5.MD5;
import org.junit.Test;

import java.security.NoSuchAlgorithmException;

/**
 * Created by qinxq on 2016/11/8 22:59
 */
public class MD5Test extends BaseTest {
    @Test
    public void MD5Test(){
        try {
            write(MD5.getSimpleMD5("this is a simple test for md5"));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}
