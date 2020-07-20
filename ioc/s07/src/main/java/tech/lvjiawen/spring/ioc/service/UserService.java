package tech.lvjiawen.spring.ioc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.lvjiawen.spring.ioc.dao.UserDao;

@Service
public class UserService {

    public UserService() {
        System.out.println("正在创建 UserService:" + this);
    }

    @Autowired
    private UserDao udao;

    public UserDao getUdao() {
        return udao;
    }

    public void setUdao(UserDao udao) {
        System.out.println("setUdao:" + udao);
        this.udao = udao;
    }
}
