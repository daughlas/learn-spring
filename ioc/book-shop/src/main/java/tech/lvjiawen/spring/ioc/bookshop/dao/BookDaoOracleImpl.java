package tech.lvjiawen.spring.ioc.bookshop.dao;

public class BookDaoOracleImpl implements BookDao {
    public void insert() {
        System.out.println("假装向 Oracle Book 表插入一条数据");
    }
}
