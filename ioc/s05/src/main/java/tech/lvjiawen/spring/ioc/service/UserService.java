package tech.lvjiawen.spring.ioc.service;

import tech.lvjiawen.spring.ioc.dao.UserDao;

public class UserService {
    private UserDao userDao;

    public UserService() {
        System.out.println("UserService 已创建：" + this);
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        System.out.println("调用 setUserDao：" + userDao);
        this.userDao = userDao;
    }
}
