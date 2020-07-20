package tech.lvjiawen.spring.ioc.dao;

import org.springframework.stereotype.Repository;

@Repository("udao")
public class UserDao {
    public UserDao() {
        System.out.println("正在创建 UserDao：" + this);
    }
}
