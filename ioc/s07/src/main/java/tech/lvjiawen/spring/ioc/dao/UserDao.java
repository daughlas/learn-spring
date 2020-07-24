package tech.lvjiawen.spring.ioc.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
// 默认 beanId 为 userDao
// 实际工作中大多数时候直接使用默认值
@Primary
public class UserDao implements  IUserDao {
    public UserDao() {
        System.out.println("正在创建 UserDao：" + this);
    }
}
