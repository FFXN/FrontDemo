package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "testBean") //这个注解就表示要响应的关键字,与类里面的关键字为/层级关系
public class TestBean {
    @RequestMapping(value = "testDemo")
    public String TestDemo(){
        return "hello";  //对应创建的hello.jsp
    }
}
