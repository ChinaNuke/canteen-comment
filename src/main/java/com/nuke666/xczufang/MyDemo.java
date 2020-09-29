package com.nuke666.xczufang;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyDemo {
    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "HelloWorld";
    }
}
