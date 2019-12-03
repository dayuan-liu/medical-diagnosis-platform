package com.ldy.platform.controller;

import com.ldy.service.SysConfigService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

   @Autowired
    SysConfigService sysConfigService;

    @RequestMapping("/")
    public String home(){
        return sysConfigService.getFirst().toString();
    }
}
