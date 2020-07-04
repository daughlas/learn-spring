package tech.lvjiawen.spring.ioc.factory;

import tech.lvjiawen.spring.ioc.entity.Apple;

/**
 * 工厂实例方法创建对象
 * IoC 容器对工厂类进行实例化并调用对应的实例方法创建对象的过程
 */
public class AppleFactoryInstance {
    public Apple createSweetApple() {
        Apple apple = new Apple();
        apple.setTitle("红富士");
        apple.setOrigin("欧洲");
        apple.setColor("红色");
        return apple;
    }
}
