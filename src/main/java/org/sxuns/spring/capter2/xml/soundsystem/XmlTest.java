package org.sxuns.spring.capter2.xml.soundsystem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:springConfig.xml")
public class XmlTest {
    @Test
    public void test(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("springConfig.xml");
        CompactDisc bean = ctx.getBean(CompactDisc.class);
        bean.play();
    }
    @Test
    public void test1(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("springConfig.xml");
        CompactDisc bean = ctx.getBean(CompactDisc.class);
        bean.play();
    }
    @Test
    public void test2(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("springConfig.xml");
        CDPlayerNew compactDiscNew = ctx.getBean("compactDiscNew", CDPlayerNew.class);
        compactDiscNew.play();
    }
}
