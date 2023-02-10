package com.example.SpringPractice.Spring_AOP;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Component
@Aspect
public class ExecutionTImeAspect {
    /**
     * 스프링 AOP는 프록시 패턴 기반으로 동작
     * */

    /** 포인트컷 **/
    @Pointcut("execution(* make(..) )")
    private void sub() {
    }

    /** 어드바이스 **/
    @Around("sub()")
    public Object ExecutionTIme(ProceedingJoinPoint joinPoint) throws Throwable {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        /** 타겟 **/
        Object proceed = joinPoint.proceed();

        stopWatch.stop();
        System.out.println(proceed + "실행시간 : " + stopWatch.getTotalTimeNanos());

        return proceed;
    }
}
