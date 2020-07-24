package tech.lvjiawen.spring.aop.service;

import tech.lvjiawen.spring.aop.service.UserService;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class UserServiceProxy1 implements UserService {
    // 持有委托类的对象
    private UserService userService;
    public UserServiceProxy1(UserService userService) {
        this.userService = userService;
    }

    public void createUser() {

        userService.createUser();
        System.out.println("====== 后置拓展功能 ======");
    }
}
