package org.sxuns.spring.capter4.concert;

import org.aspectj.lang.ProceedingJoinPoint;

public class Audience {
    public void silenceCellPhones(){
        System.out.println("调整手机到静音");
    }

    public void takeSeats(){
        System.out.println("就坐");
    }

    public void applause(){
        System.out.println("因演出精彩而鼓掌");
    }

    public void demandRefund(){
        System.out.println("因演出不好，而要求退款");
    }

    //环绕通知
    public void watchPerformance(ProceedingJoinPoint jp){
        try {
            System.out.println("===========环绕通知前==============");
            jp.proceed();
            System.out.println("========环绕通知后==============");
        } catch (Throwable throwable) {
            System.out.println("========环绕通知异常捕获==========");
        }
    }
}
