import org.apache.log4j.Logger;
import org.junit.Test;

/**
 * creat by qinxq on 2016/10/23 15:06
 */
public class LogTest {
    @Test
    public void logTest(){
        Logger logger=Logger.getLogger(this.getClass());
        logger.info("日志测试");
    }
}
