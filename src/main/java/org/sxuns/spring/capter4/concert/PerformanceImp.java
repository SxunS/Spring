package org.sxuns.spring.capter4.concert;

public class PerformanceImp implements Performance {
    @Override
    public void perform() {
        int i = 1/0;
        System.out.println(i);
        System.out.println("===========演员正在唱歌。。。。。。");

    }
}
