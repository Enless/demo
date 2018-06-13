package com.example.demo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by giggbox on 2018/6/13.
 */
@RestController
public class HelloWorldController {

    @RequestMapping("/hello")
    public String hello(){
        return "Hello World";
    }

    @RequestMapping("/hellofn")
    public String helloFromName(String name){
        return "Hello World," + name;
    }
}
