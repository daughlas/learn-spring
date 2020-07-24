import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import tech.lvjiawen.spring.ioc.service.UserService;

import javax.annotation.Resource;

// 将 junit 4 的执行权交给 spring test，在测试用例执行前自动初始化 IoC 容器
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class SpringTester {
    @Resource
    private UserService userService;

    @Test
    public void testUserService() {
        userService.createUser();
    }
}
