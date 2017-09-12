package com.example.demostudygroup.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

    @RequestMapping("/hello")
    public String hello(){
        return "Hello There";
    }

}
