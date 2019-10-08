package com.tools.extract2kafka.rlsbbj.controller;

import oracle.jdbc.proxy.annotation.Post;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 2019/10/7
 * Administrator
 * com.tools.extract2kafka.rlsbbj.controller
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @PostMapping("/arg")
    public String test01(String userName, String pwd){

        return userName+" -> "+pwd;
    }
}
