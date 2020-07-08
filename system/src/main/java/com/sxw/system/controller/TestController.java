package com.sxw.system.controller;

import com.sxw.system.domain.Test;
import com.sxw.system.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
    @Autowired
    private TestService testService;

    @RequestMapping("/test")
    public List<Test> test(){
        List<Test> test = testService.test();
        return test;
    }
}
