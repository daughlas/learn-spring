package tech.lvjiawen.springbootlearn;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/prefix")
public class ParaController {
    @GetMapping("/firstrequest")
    public String firstRequest() {
        return "第一个 spring boot 接口";
    }

    @GetMapping("/requestPara")
    public String requestPara(@RequestParam Integer num) {
        return "para from request:" + num;
    }

    @GetMapping("/para/{num}")
    public String pathPara(@PathVariable Integer num) {
        return "para from path:" + num;
    }

    @GetMapping({"/multiurl1/{num}", "multiurl2/{num}"})
    public String multiURL(@PathVariable Integer num) {
        return "para from path:" + num;
    }

    @GetMapping("/required")
    public String required(@RequestParam(required = false, defaultValue = "0") Integer num) {
        return "required num :" + num;
    }
}
