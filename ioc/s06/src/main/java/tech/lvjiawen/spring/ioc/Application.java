package tech.lvjiawen.spring.ioc;

import tech.lvjiawen.spring.ioc.context.ApplicationContext;
import tech.lvjiawen.spring.ioc.context.ClassPathXmlApplicationContext;
import tech.lvjiawen.spring.ioc.entity.Apple;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext();
        Apple apple = (Apple) context.getBean("sweetApple");
        System.out.println(apple);
    }
}
