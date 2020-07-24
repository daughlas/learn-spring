package tech.lvjiawen.spring.aop.service;

import tech.lvjiawen.spring.aop.service.UserService;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class UserServiceProxy implements UserService {
    // 持有委托类的对象
    private UserService userService;
    public UserServiceProxy(UserService userService) {
        this.userService = userService;
    }

    public void createUser() {
        System.out.println("======" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").format(new Date()) + "======");
        userService.createUser();
    }
}
