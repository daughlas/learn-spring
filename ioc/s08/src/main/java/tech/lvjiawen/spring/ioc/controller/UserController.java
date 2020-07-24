package tech.lvjiawen.spring.ioc.controller;

import tech.lvjiawen.spring.ioc.service.UserService;

public class UserController {
    UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
