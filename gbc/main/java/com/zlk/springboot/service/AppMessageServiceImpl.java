package com.zlk.springboot.service;

import com.zlk.springboot.entity.AppMessage;
import com.zlk.springboot.mapper.AppMessageMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class AppMessageServiceImpl implements  AppMessageService {


    @Resource
    private AppMessageMapper appMessageMapper;
    @Override
    public List<AppMessage> selectAll() {
        return appMessageMapper.selectAll();
    }
}
