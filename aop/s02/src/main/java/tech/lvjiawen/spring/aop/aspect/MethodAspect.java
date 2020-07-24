package tech.lvjiawen.spring.aop.aspect;

import org.aspectj.lang.JoinPoint;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MethodAspect {

    // JoinPoint 连接点，获取目标类、目标方法的信息
    public void printExecutionTime(JoinPoint joinPoint) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String now = sdf.format(new Date());
        String className = joinPoint.getTarget().getClass().getName(); // 获取目标类的名称
        String methodName = joinPoint.getSignature().getName();
        System.out.println("-------> " + now + ":" + className + "." + methodName);
    }

    // 返回后通知
    public void doAfterReturning(JoinPoint joinPoint, Object ret) {
        System.out.println("<---- 返回后通知：" + ret);
    }

    public void doAfterThrowing(JoinPoint joinPoint, Throwable th) {
        System.out.println("<---- 异常通知：" + th.getMessage());
    }

    public void doAfter(JoinPoint joinPoint) {
        System.out.println("<------触发后置通知");
    }
}
