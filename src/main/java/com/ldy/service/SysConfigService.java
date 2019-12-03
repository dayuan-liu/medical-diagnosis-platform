package com.ldy.service;

import com.ldy.domain.SysConfig;
import com.ldy.mapper.SysConfigMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysConfigService {

    @Autowired
    SysConfigMapper sysConfigMapper;

    public SysConfig getFirst(){
        return sysConfigMapper.getFirst();
    }
}
