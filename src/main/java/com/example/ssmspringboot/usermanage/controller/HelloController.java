package com.example.ssmspringboot.usermanage.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String hello(Model m){
        m.addAttribute("now","成功");
        return "hello";
    }
}
