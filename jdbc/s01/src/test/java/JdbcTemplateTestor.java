import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import tech.lvjiawen.spring.jdbc.dao.EmployeeDao;
import tech.lvjiawen.spring.jdbc.entity.Employee;
import tech.lvjiawen.spring.jdbc.service.EmployeeService;

import javax.annotation.Resource;
import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class JdbcTemplateTestor {
    @Resource
    private EmployeeDao employeeDao;
    @Resource
    private EmployeeService employeeService;

    @Test
    public void testFindById() {
        Employee employee = employeeDao.findById(3308);
        System.out.println(employee);
    }

    @Test
    public void testFindByDname() {
        System.out.println(employeeDao.findByDname("市场部"));
    }

    @Test
    public void testFindMapByDname() {
        System.out.println(employeeDao.findMapByDname("研发部"));
    }

    @Test
    public void testInsert() {
        Employee employee = new Employee();
        employee.setEno(888);
        employee.setEname("赵六");
        employee.setSalary(6666f);
        employee.setDname("研发部");
        employee.setHiredate(new Date());
        employeeDao.insert(employee);
    }

    @Test
    public void testUpdate() {
        Employee employee = employeeDao.findById(888);
        employee.setSalary(employee.getSalary() + 1000);
        int count  = employeeDao.update(employee);
        System.out.println("本次更新"+ count + "条数据！");
    }

    @Test
    public void testDelete() {
        int count  = employeeDao.delete(888);
        System.out.println("本次删除"+ count + "条数据！");
    }

    @Test
    public void testBatchImport() {
        employeeService.batchImport();
        System.out.println("批量导入成功");
    }

}
