package com.dean.redistest.service.impl;

import com.dean.redistest.model.TestModel;
import com.dean.redistest.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Override
    public TestModel getTestModel(String key) {
        String info = redisTemplate.opsForValue().get(key);
        return new TestModel(info);
    }

    @Override
    public TestModel updateTestModel(String key, TestModel testModel) {
        redisTemplate.opsForValue().set(key, testModel.getInfo());
        return testModel;
    }

    @Override
    public TestModel createTestModel(String key, TestModel testModel) {
        redisTemplate.opsForValue().set(key, testModel.getInfo());
        return testModel;
    }
}
