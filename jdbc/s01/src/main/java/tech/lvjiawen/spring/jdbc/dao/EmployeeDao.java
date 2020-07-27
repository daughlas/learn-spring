package tech.lvjiawen.spring.jdbc.dao;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import java.util.List;
import java.util.Map;

import tech.lvjiawen.spring.jdbc.entity.Employee;

public class EmployeeDao {
    private JdbcTemplate jdbcTemplate;

    public Employee findById(Integer eno) {
        String sql = "SELECT * FROM employee WHERE eno = ?";
        // 查询单条数据
        Employee employee = jdbcTemplate.queryForObject(sql, new Object[]{eno}, new BeanPropertyRowMapper<Employee>(Employee.class));
        return employee;
    }

    public List<Employee> findByDname(String dname) {
        String sql = "SELECT * FROM employee WHERE dname = ?";
        // 查询复合数据
        List<Employee> list = jdbcTemplate.query(sql, new Object[]{dname}, new BeanPropertyRowMapper<Employee>(Employee.class));
        return list;
    }

    public List<Map<String, Object>> findMapByDname(String dname) {
        String sql = "SELECT eno as empno, salary as s from employee where dname = ?";
        List<Map<String, Object>> maps =  jdbcTemplate.queryForList(sql, new Object[]{dname});
        return maps;
    }

    public void insert(Employee employee) {
        String sql = "INSERT INTO employee(eno, ename, salary, dname, hiredate) values(?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, new Object[]{
            employee.getEno(),
            employee.getEname(),
            employee.getSalary(),
            employee.getDname(),
            employee.getHiredate()
        });
    }

    public int update(Employee employee) {
        String sql = "UPDATE employee SET ename = ?, salary = ?, dname = ?, hiredate = ? where eno = ?";
        int count = jdbcTemplate.update(sql, new Object[]{
            employee.getEname(),
            employee.getSalary(),
            employee.getDname(),
            employee.getHiredate(),
            employee.getEno(),
        });
        return count;
    }

    public int delete (Integer eno) {
        String sql = "delete from employee where eno = ?";
        return jdbcTemplate.update(sql, new Object[]{eno});
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

}
