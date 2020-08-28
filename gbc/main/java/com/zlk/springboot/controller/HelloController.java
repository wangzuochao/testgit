package com.zlk.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Controller 处理请求
 */
@RestController
public class HelloController {
    /**
     * 接收来自浏览器的hello请求
     * @return
     */
    @RequestMapping("/hello")
    public String hello(){
        return "HelloWorld!";
    }

}
