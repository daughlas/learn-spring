package tech.lvjiawen.spring.ioc.bookshop.service;

import tech.lvjiawen.spring.ioc.bookshop.dao.BookDao;

public class BookService {
    private BookDao bookDao;

    public void purchase() {
        System.out.println("假装正在执行图书采购方法：");
        bookDao.insert();
    }

    public BookDao getBookDao() {
        return bookDao;
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }


}
