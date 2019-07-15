package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//@Controller  //这个注解用于返回jsp文件
@RestController  //这个注解用于返回字符串显示在网页上
public class HelloController {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String say(){
        return "hello China !";
    }
}
