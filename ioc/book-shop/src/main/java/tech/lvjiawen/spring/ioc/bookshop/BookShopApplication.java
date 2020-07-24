package tech.lvjiawen.spring.ioc.bookshop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import tech.lvjiawen.spring.ioc.bookshop.service.BookService;

public class BookShopApplication {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext-*.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        bookService.purchase();
    }
}


