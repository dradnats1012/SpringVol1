package aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TimeTraceAop {
    @Around("execution(* com.example.TimeTrace..*(..))")
    public Object execute(ProceedingJoinPoint joinPoint) throws Throwable{
        Object result = null;
        try {
            long start = System.currentTimeMillis();
            result = joinPoint.proceed();
            long end = System.currentTimeMillis();

            System.out.println("수행 시간 : "+ (end - start));
        } catch (Throwable throwable) {
            System.out.println("exception! ");
        }
        return result;
    }
}
