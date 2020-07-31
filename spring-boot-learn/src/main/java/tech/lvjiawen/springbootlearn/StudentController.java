package tech.lvjiawen.springbootlearn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/student")
    public String student(@RequestParam Integer num) {
        Student student = studentService.findStudent(num);
        if (student == null) {
            return "没查到";
        }
        return student.toString();
    }
}
