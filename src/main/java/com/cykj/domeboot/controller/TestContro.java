package com.cykj.domeboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestContro {


    @RequestMapping("test")
    public String hello() {
        return "测试---";
    }
}
