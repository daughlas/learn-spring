package tech.lvjiawen.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import tech.lvjiawen.spring.aop.service.UserService;

public class SpringApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        UserService userService =  context.getBean("userService", UserService.class);
        userService.createUser();

        userService.generateRandomPassword("md5", 16);
    }

}
