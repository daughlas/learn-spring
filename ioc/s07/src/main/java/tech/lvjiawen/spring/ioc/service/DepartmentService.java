package tech.lvjiawen.spring.ioc.service;

import org.springframework.stereotype.Service;
import tech.lvjiawen.spring.ioc.dao.IUserDao;

import javax.annotation.Resource;

@Service
public class DepartmentService {
    /**
     * 1. @Resource 设置 name 属性，则按 name 在 IoC 容器中将 bean 注入
     * 2. @Resource 未设置 name 属性
     * 2.1 以属性名作为 bean name 在 IoC 容器中匹配 bean，如有匹配则注入
     * 2.2 按属性名未匹配，则按类型进行匹配，统 @Autowired，需加入 @Primary 解决类型冲突
     * 使用建议：在使用 @Resource 对象时推荐设置 name 或保证属性名与 bean 名称一致
     */
//    @Resource(name="userOracleDao")
//    private IUserDao udao;

    @Resource
    private IUserDao userDao;

    public void joinDepartment() {
        System.out.println(userDao);
    }
}
