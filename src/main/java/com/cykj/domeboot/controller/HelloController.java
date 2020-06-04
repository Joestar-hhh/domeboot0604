package com.cykj.domeboot.controller;

import com.cykj.domeboot.entity.TbUser;
import com.cykj.domeboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@RestController
public class HelloController {

    @Autowired
    private UserService userService;

    @RequestMapping("hello")
    public String hello(){
        return "hello---";
    }

    @RequestMapping("/userLogin")
    public Object userLogin() throws IOException {

        TbUser tbUser = new TbUser();
        tbUser.setAccount("user01");
        tbUser.setPwd("123");
        TbUser tbUserLogin = userService.userLogin(tbUser);

        return tbUserLogin;
    }
}
