package com.ldy.mapper;

import com.ldy.domain.SysConfig;
import org.springframework.stereotype.Repository;

@Repository
public interface SysConfigMapper {
    SysConfig getFirst();
    
}
