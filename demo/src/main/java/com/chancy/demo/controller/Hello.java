package com.chancy.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @RequestMapping(value = "/test")
    public String HelloWorld() {
        return "hello world";
    }
}
