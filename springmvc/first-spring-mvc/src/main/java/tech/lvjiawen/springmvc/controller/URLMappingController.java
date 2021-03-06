package tech.lvjiawen.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tech.lvjiawen.springmvc.entity.User;

@Controller
@RequestMapping("/common")
public class URLMappingController {
    @GetMapping("/g")
    @ResponseBody
    public String getMapping(@RequestParam("manager_name") String managerName) {
        System.out.println("managerName=" + managerName);
        return "This is get method";
    }

    @PostMapping("/p")
    @ResponseBody
    public String postMapping (String username, String password) {
        System.out.println(username + ":" + password);
        return "This is post method";
    }

    @PostMapping("/p1")
    @ResponseBody
    public String postMapping1(User user) {
        System.out.println(user.getUsername() + ":" + user.getPassword());
        return "This is another post method";
    }
}
