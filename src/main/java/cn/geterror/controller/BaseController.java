package cn.geterror.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController()
public class BaseController {
    @GetMapping("/alive")
    public String alive(){
        return "still alive";
    }
}
