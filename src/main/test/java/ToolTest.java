import com.qin.qinxq.global.tool.UUID;
import org.junit.Test;

/**
 * Created by qinxq on 2016/11/7 23:36
 */
public class ToolTest {
    @Test
    public void uuidTest(){
        for(int i=10;i>0;i--){
            write(UUID.getOne());
        }
    }
    public void write(Object object){
        System.out.println(object.toString());
    }
}
