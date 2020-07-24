package tech.lvjiawen.spring.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
@Component // 当前容器需要被 IoC 容器实例化并加载
@Aspect // 说明当前类是一个切面类
public class MethodChecker {
    // 参数为切点表达式
    @Around("execution(* tech.lvjiawen..*Service.*(..))")
    public Object check(ProceedingJoinPoint pjp) throws Throwable {
        try {
            long startTime = new Date().getTime();
            Object ret = pjp.proceed();//执行目标方法
            long endTime = new Date().getTime();
            long duration = endTime - startTime; //执行时长
            if(duration >= 1000){
                String className = pjp.getTarget().getClass().getName();
                String methodName = pjp.getSignature().getName();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
                String now = sdf.format(new Date());
                System.out.println("=======" + now + ":" + className + "." + methodName + "(" + duration + "ms)======");
            }
            return ret;
        } catch (Throwable throwable) {
            System.out.println("Exception message:" + throwable.getMessage());
            throw throwable;
        }
    }

    @Before("execution(* tech.lvjiawen..*Service.*(..))")
    public void preMethod(JoinPoint joinPoint) {
        System.out.println("执行之前");

    }

    @After("execution(* tech.lvjiawen..*Service.*(..))")
    public void afterMethod(JoinPoint joinPoint) {
        System.out.println("执行之后");

    }
}
