package tech.lvjiawen.spring.restful.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tech.lvjiawen.spring.restful.entity.Person;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/restful")
@CrossOrigin(origins = {"http://localhost:8099"})
public class RestfulController {

    @GetMapping("/request")
    public String doGetRequest() {
        return "{\"message\": \"返回查询结果\"}";
    }

    @PostMapping("/request/{rid}")
    public String doPostRequest(@PathVariable("rid") Integer requestId, Person person) {
        System.out.println(person.getName() + "：" + person.getAge());
        return "{\"message\": \"数据新建成功\", \"id\":" + requestId +"}";
    }

    @PutMapping("/request")
    public String doPutRequest(Person person) {
        System.out.println(person.getName() + "：" + person.getAge());
        return "{\"message\": \"数据更新成功\"}";
    }

    @DeleteMapping("/request")
    public String doDeleteRequest() {
        return "{\"message\": \"数据删除成功\"}";
    }

    @GetMapping("/person")
    public Person findByPersonId(Integer id) {
        Person p = new Person();
        if (id == 1) {
            p.setName("lvjiawen");
            p.setAge(32);
        } else {
            p.setName("lily");
            p.setAge(28);
        }
        return p;
    }

    @GetMapping("/persons")
    public List<Person> findPersons() {
        List list = new ArrayList();
        Person p1 = new Person();
        Person p2 = new Person();
        p1.setName("lvjiawen");
        p1.setAge(32);
        p1.setBirthday(new Date());
        p2.setName("lily");
        p2.setAge(28);
        p2.setBirthday(new Date());
        list.add(p1);
        list.add(p2);
        return list;
    }
}