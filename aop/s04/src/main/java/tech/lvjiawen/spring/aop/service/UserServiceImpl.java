package tech.lvjiawen.spring.aop.service;

public class UserServiceImpl implements UserService {
    public void createUser() {
        System.out.println("执行创建用户业务逻辑");
    }
}
