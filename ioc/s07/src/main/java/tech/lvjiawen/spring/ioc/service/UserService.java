package tech.lvjiawen.spring.ioc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.lvjiawen.spring.ioc.dao.IUserDao;

@Service
public class UserService {

    public UserService() {
        System.out.println("正在创建 UserService:" + this);
    }

    @Autowired
    // 按照类型进行装配
    // Spring IoC 容器会自动通过反射技术将属性 private 修饰符自动改为 public，直接进行赋值
    // 不再执行setUdao 方法
    // 让机场开发中这种常用
    private IUserDao udao;

    public IUserDao getUdao() {
        return udao;
    }

//    @Autowired
//    // 如果装配注解放在 set 方法上，则自动按类型/名称对set方法参数进行注入
//    public void setUdao(UserDao udao) {
//        System.out.println("setUdao:" + udao);
//        this.udao = udao;
//    }
}
