package tech.lvjiawen.spring.aop;

import tech.lvjiawen.spring.aop.service.UserService;
import tech.lvjiawen.spring.aop.service.UserServiceImpl;
import tech.lvjiawen.spring.aop.service.UserServiceProxy;
import tech.lvjiawen.spring.aop.service.UserServiceProxy1;

public class Application {
    public static void main(String[] args) {
        UserService userService = new UserServiceProxy1(new UserServiceProxy(new UserServiceImpl()));
        userService.createUser();
    }
}
