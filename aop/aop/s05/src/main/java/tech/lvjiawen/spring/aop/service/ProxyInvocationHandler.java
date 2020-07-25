package tech.lvjiawen.spring.aop.service;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * InvocationHandler 是 JDK 提供的反射类，用于在 JDK 动态代理中对目标方法进行增强
 * InvocationHandler 实现类与切面类的环绕通知类似
 */
public class ProxyInvocationHandler implements InvocationHandler {
    private Object target;

    private ProxyInvocationHandler(Object target) {
        this.target = target;
    }

    /**
     * 在 invoke() 方法对目标方法进行增强
     * @param proxy 代理类对象
     * @param method 目标方法对象
     * @param args 目标方法实参
     * @return 目标方法执行后的返回值
     * @throws Throwable 目标方法抛出的异常
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("====" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").format(new Date()) + "===");
        Object ret = method.invoke(target, args);
        return ret;
    }

    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();


        InvocationHandler invocationHandler = new ProxyInvocationHandler(userService);

        UserService userServiceProxy = (UserService) Proxy.newProxyInstance(
                userService.getClass().getClassLoader(),
                userService.getClass().getInterfaces(),
                invocationHandler
        );
        userServiceProxy.createUser();

        EmployeeService employeeService = new EmployeeServiceImpl();
        EmployeeService employeeServiceProxy = (EmployeeService) Proxy.newProxyInstance(
                employeeService.getClass().getClassLoader(),
                employeeService.getClass().getInterfaces(),
                new ProxyInvocationHandler(employeeService)
        );
        employeeServiceProxy.createEmployee();
    }
}
