package tech.lvjiawen.springbootlearn;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class PropertiesController {
    @Value("${school.grade}")
    Integer grade;

    @Value("${school.classNum}")
    Integer classNum;

    @GetMapping("/gradeclass")
    public String gradeAndClassNum() {
        return grade + "年级" + classNum + "班";
    }
}
