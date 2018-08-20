package com.dean.redistest.service;

import com.dean.redistest.model.TestModel;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public interface TestService {
    TestModel getTestModel(String key);
    TestModel updateTestModel(String key, TestModel testModel);
    TestModel createTestModel(String key, TestModel testModel);
 }

