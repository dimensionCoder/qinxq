import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by qinxq on 2016/10/23 15:06
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:/spring-mybatis.xml"})
public class LogTest {
    @Test
    public void logTest(){
        Logger logger=Logger.getLogger(this.getClass());
        logger.info("日志测试");
    }
}
