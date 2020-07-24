package tech.lvjiawen.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import tech.lvjiawen.spring.ioc.service.DepartmentService;
import tech.lvjiawen.spring.ioc.service.UserService;

public class SpringApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:ApplicationContext.xml");
        UserService userService = context.getBean("userService", UserService.class);
        String[] ids = context.getBeanDefinitionNames();

//        for (String id: ids) {
//            System.out.println(id+ ":" + context.getBean(id));
//        }

        DepartmentService departmentService = context.getBean("departmentService", DepartmentService.class);
        departmentService.joinDepartment();
    }
}
