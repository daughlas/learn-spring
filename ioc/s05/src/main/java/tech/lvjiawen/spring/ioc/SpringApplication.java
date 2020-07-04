package tech.lvjiawen.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import tech.lvjiawen.spring.ioc.dao.UserDao;
import tech.lvjiawen.spring.ioc.entity.Order;
import tech.lvjiawen.spring.ioc.service.UserService;

public class SpringApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
//        UserDao userDao1 = context.getBean("userDao", UserDao.class);
//        UserDao userDao2 = context.getBean("userDao", UserDao.class);
//        UserDao userDao3 = context.getBean("userDao", UserDao.class);


//        UserService userService1 = context.getBean("userService", UserService.class);
//        UserService userService2 = context.getBean("userService", UserService.class);
//        UserService userService3 = context.getBean("userService", UserService.class);
//        UserService userService4 = context.getBean("userService", UserService.class);

        Order order1 = context.getBean("order1", Order.class);
        order1.pay();
        ((ClassPathXmlApplicationContext) context).registerShutdownHook();
    }
}
