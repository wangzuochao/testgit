package com.zlk.springboot.service;

import com.zlk.springboot.entity.AppMessage;

import java.util.List;

public interface AppMessageService {

    List<AppMessage> selectAll();
}
