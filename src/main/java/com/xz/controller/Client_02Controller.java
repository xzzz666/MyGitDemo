package com.xz.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Client_02Controller {
    @Value("${server.port}")
    String port;
    @RequestMapping("hello/{name}")
    public String hello(@PathVariable String name){
        return "我的端口号是："+name+"   "+port;
    }
}
