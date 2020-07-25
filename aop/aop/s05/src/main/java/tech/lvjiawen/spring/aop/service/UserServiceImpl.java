package tech.lvjiawen.spring.aop.service;

public class UserServiceImpl implements UserService {
    public void createUser() {
        System.out.println("执行了 添加用户的方法");
    }
}
