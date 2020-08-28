package com.ge.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Controller 处理请求
 */
@Controller
public class HelloController {
    /**
     * 接收来自浏览器的hello请求
     * @return
     */
    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "HelloWorld!";
    }
}