package com.zlk.springboot.controller;


import com.zlk.springboot.entity.AppMessage;
import com.zlk.springboot.service.AppMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class AppMessageController {

    @Autowired
    private AppMessageService appMessageService;

    @RequestMapping(value = "/selectAll")
    @ResponseBody
    public List<AppMessage> selectAllMessage(){
        List<AppMessage> appMessages = appMessageService.selectAll();
        for (AppMessage appMessage : appMessages) {
            System.out.println(appMessage.toString());
        }
        return appMessages;
    }
    @RequestMapping(value = "/index")
    public String hello(){
        return "index";
    }

    @RequestMapping(value = "/test")
    public String test() {
        return "test";
    }



    @RequestMapping(value = "/list")
    public String list(){
        System.out.println(1);
        return "list";
    }
}
