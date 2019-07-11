package online.grisk.apolo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApoloApplicationTests {

    ApoloApplication apoloApplication = new ApoloApplication();

    @Test
    public void contextLoads() {
        ApoloApplication.main(new String[0]);
    }

}
