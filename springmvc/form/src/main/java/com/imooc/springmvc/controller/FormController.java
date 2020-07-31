package com.imooc.springmvc.controller;

import com.imooc.springmvc.entity.Form;
import com.imooc.springmvc.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
public class FormController {
    @GetMapping("/g")
    @ResponseBody
    public String getMapping(String name) {
        System.out.println(name);
        return "This is a get page";
    }
//    @PostMapping("/apply")
    @ResponseBody
    public String apply(@RequestParam(value = "n",defaultValue = "ANON") String name, String course, Integer[] purpose){
        System.out.println(name);
        System.out.println(course);
        for (Integer p : purpose) {
            System.out.println(p);
        }
        return "SUCCESS";
    }

//    @PostMapping("/apply")
    @ResponseBody
    public String apply(String name, String course, @RequestParam List<Integer> purpose){
        System.out.println(name);
        System.out.println(course);
        for (Integer p : purpose) {
            System.out.println(p);
        }
        return "SUCCESS";
    }

//    @PostMapping("/apply")
    @ResponseBody
    public String apply(Form form){
        return "SUCCESS";
    }

//    @PostMapping("/apply")
    @ResponseBody
    public String apply(@RequestParam Map map){
        System.out.println(map);
        return "SUCCESS";
    }

    @PostMapping("/apply")
    @ResponseBody
    public String applyDelivery(Form form) {
        System.out.println(form.getName());
        System.out.println(form.getDelivery().getName());
        return "吕嘉文Post你好";
    }

    @GetMapping("/view")
    public ModelAndView showView (Integer userId) {
        ModelAndView mav = new ModelAndView("/view.jsp");
        User user = new User();

        if (userId == null) {
            user.setUsername("lily");
        } else if (userId == 1) {
            user.setUsername("lucy");
        } else {
            user.setUsername("smith");
        }
        mav.addObject("u", user);
        return mav;
    }
}
