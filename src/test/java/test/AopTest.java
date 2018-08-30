package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.sxuns.spring.capter2.mix.soundsystem.CompactDisc;
import org.sxuns.spring.capter4.concert.CountTrack;
import org.sxuns.spring.capter4.concert.Performance;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:aop-config.xml")
public class AopTest {
    private ApplicationContext ctx = new ClassPathXmlApplicationContext("aop-config.xml");
    private CompactDisc compactDisc = ctx.getBean("compactDisc", CompactDisc.class);

//    @Autowired
//    private CountTrack countTrack;
    private CountTrack countTrack = ctx.getBean("countTrack",CountTrack.class);
    @Test
    public void test01(){
        Performance performance = ctx.getBean(Performance.class);
        performance.perform();
    }
    @Test
    public void test02(){
        compactDisc.playTrack(0);
        compactDisc.playTrack(2);
        compactDisc.playTrack(2);
        compactDisc.playTrack(1);
        compactDisc.playTrack(2);
        compactDisc.playTrack(1);
        compactDisc.playTrack(1);
        compactDisc.playTrack(0);
        System.out.println(countTrack.getCount(0));
        System.out.println(countTrack.getCount(1));
        System.out.println(countTrack.getCount(2));
    }
}
