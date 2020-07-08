package com.sxw.system.service.impl;

import com.sxw.system.domain.Test;
import com.sxw.system.mapper.TestMapper;
import com.sxw.system.service.TestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestServiceImpl implements TestService {
    @Resource
    private TestMapper testMapper;
    @Override
    public List<Test> test() {
        return testMapper.list();
    }
}
