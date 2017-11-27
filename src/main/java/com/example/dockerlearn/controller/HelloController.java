package com.example.dockerlearn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sifu
 */
@RestController
public class HelloController {
    @RequestMapping("/")
    public String hello(){
        return "hello world!";
    }
}
