package tech.lvjiawen.spring.ioc.bookshop.dao;

public class BookDaoImpl implements BookDao {
    public void insert() {
        System.out.println("假装向 mySQL Book 表插入一条数据");
    }
}
