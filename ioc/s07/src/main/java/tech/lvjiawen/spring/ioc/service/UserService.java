package tech.lvjiawen.spring.ioc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import tech.lvjiawen.spring.ioc.dao.IUserDao;

import javax.annotation.PostConstruct;

@Service
@Scope("prototype")
public class UserService {
    @Value("${metaData}")
    private String metaData;

    public UserService() {
        System.out.println("正在创建 UserService:" + this);
    }

    @PostConstruct
    public void init() {
        System.out.println("初始化 UserService 对象，metadata = " + metaData);
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
