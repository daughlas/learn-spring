package tech.lvjiawen.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import tech.lvjiawen.spring.ioc.entity.Company;

public class SpringApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        Company company = context.getBean("company", Company.class);
        System.out.println(company);
        System.out.println(company.getInfo().getProperty("address"));
        System.out.println("=========================================");
        String[] beanNames = context.getBeanDefinitionNames();
        for(String beanName: beanNames) {
            System.out.println(context.getBean(beanName).getClass().getName());
            System.out.println(context.getBean(beanName).toString());
        }
    }
}
