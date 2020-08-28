package com.zlk.springboot.mapper;

import com.zlk.springboot.entity.AppMessage;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AppMessageMapper {

    List<AppMessage> selectAll();

}
