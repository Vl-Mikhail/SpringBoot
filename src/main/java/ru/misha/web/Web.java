package ru.misha.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Web {

    @RequestMapping("/hello")
    public String hello() {
        return "hello-world";
    }
}
