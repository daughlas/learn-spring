package tech.lvjiawen.spring.jdbc.service;

import tech.lvjiawen.spring.jdbc.dao.EmployeeDao;
import tech.lvjiawen.spring.jdbc.entity.Employee;
import java.util.Date;

public class EmployeeService {
    private EmployeeDao employeeDao;
    private BatchService batchService;

    public void batchImport() {
        for (int i = 1; i <= 10; i++) {
//            if (i==3) {
//                throw new RuntimeException("一场啦！");
//            }
            Employee employee = new Employee();
            employee.setEno(8000 + i);
            employee.setEname("员工" + i);
            employee.setSalary(4000f);
            employee.setDname("市场部");
            employee.setHiredate(new Date());
            employeeDao.insert(employee);
        }
    }

    public void startImportJob() {
        batchService.importJob1();
        if (1==1) {
            throw new RuntimeException("程序出错啦");
        }
        batchService.importJob2();
        System.out.println("批量导入成功");
    }


    public EmployeeDao getEmployeeDao() {
        return employeeDao;
    }

    public void setEmployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    public BatchService getBatchService() {
        return batchService;
    }

    public void setBatchService(BatchService batchService) {
        this.batchService = batchService;
    }
}
