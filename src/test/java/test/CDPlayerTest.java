package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.sxuns.spring.capter2.soundsystem.CDPlayerConfig;
import org.sxuns.spring.capter2.soundsystem.CompactDisc;

/**
 * @author s_xun
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {
    @Autowired
    private CompactDisc cd;
    @Test
    public void test1(){
        cd.play();
    }
}
