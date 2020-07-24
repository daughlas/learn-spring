package tech.lvjiawen.spring.ioc.service;

import tech.lvjiawen.spring.ioc.dao.EmployeeDao;
import tech.lvjiawen.spring.ioc.dao.UserDao;

public class UserService {
    private UserDao userDao;
    private EmployeeDao employeeDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public EmployeeDao getEmployeeDao() {
        return employeeDao;
    }

    public void setEmployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }
}
