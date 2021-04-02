package com.mooc.sb2.service;

import com.mooc.sb2.bean.Demo;
import com.mooc.sb2.mapper.DemoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author mao  2021/3/6 2:27
 */
@Service
public class DemoService {
    @Autowired
    private DemoMapper demoMapper;

    public Demo getDemoById(Integer id) {
        return Optional.ofNullable(demoMapper.selectByPrimaryKey(id)).orElse(null);
    }


}
