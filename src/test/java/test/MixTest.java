package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.sxuns.spring.capter2.mix.soundsystem.CDPlayer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:cd-config.xml")
public class MixTest {
    @Autowired
    private CDPlayer cdPlayer;
    @Test
    public void test1(){
        cdPlayer.cdPlayerPlay();
    }
    @Test
    public void test2(){
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:cd-config.xml");
//        //FIXME 此处自动注入可以获取  bean  但是ctx get不到？？？？
//        CDPlayer cdPlayer = ctx.getBean("cdPlayer", CDPlayer.class);
        cdPlayer.cdPlayerPlay();
    }
}
