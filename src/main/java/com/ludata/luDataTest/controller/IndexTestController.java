package com.ludata.luDataTest.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/show")
public class IndexTestController {

    @RequestMapping("/showIndex")
    public String showIndex(){
        System.out.println("刘梓江");
        System.currentTimeMillis();
        return "index";
    }
}
