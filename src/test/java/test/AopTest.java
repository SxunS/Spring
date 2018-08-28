package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.sxuns.spring.capter4.concert.Performance;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:aop-config.xml")
public class AopTest {
    @Test
    public void test01(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("aop-config.xml");
        Performance performance = ctx.getBean(Performance.class);
        performance.perform();
    }
}
