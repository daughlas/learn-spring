package tech.lvjiawen.spring.ioc;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import tech.lvjiawen.spring.ioc.controller.UserController;
import tech.lvjiawen.spring.ioc.dao.EmployeeDao;
import tech.lvjiawen.spring.ioc.dao.UserDao;
import tech.lvjiawen.spring.ioc.service.UserService;

@Configurable
@ComponentScan(basePackages="tech.lvjiawen")
public class Config {
    @Bean
    public UserDao userDao() {
        UserDao userDao = new UserDao();
        System.out.println("已创建" + userDao);
        return userDao;
    }

    @Bean
    public UserService userService(UserDao userDao, EmployeeDao employeeDao) {
        UserService userService = new UserService();
        System.out.println("已创建" + userService);
        userService.setUserDao(userDao);
        System.out.println("调用setUserDao:" + userDao );
        userService.setEmployeeDao(employeeDao);
        System.out.println("调用setEmployeeDao:" + employeeDao );
        return userService;
    }

    @Bean
    UserController userController(UserService userService) {
        UserController userController = new UserController();
        System.out.println("已创建" + userController);
        userController.setUserService(userService);
        System.out.println("调用setUserService:" + userService );
        return userController;
    }
}
