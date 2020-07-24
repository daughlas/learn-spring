package tech.lvjiawen.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import tech.lvjiawen.spring.ioc.entity.Apple;
import tech.lvjiawen.spring.ioc.entity.Child;
import tech.lvjiawen.spring.ioc.entity.Person;

public class SpringApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        Apple sweetApple = context.getBean("sweetApple", Apple.class);
        System.out.println(sweetApple.getTitle());

        Child lily = context.getBean("lily", Child.class);
        lily.eat();

        Child andy = context.getBean("andy", Child.class);
        andy.eat();

        Child luna = context.getBean("luna", Child.class);
        luna.eat();

        Person girl = context.getBean("girl", Person.class);
        girl.dress();

        Person boy = context.getBean("boy", Person.class);
        boy.dress();
    }
}
