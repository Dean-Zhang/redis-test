package com.dean.redistest.controller;

import com.dean.redistest.model.TestModel;
import com.dean.redistest.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/v1")
@RestController
public class TestController {
    @Autowired
    private TestService testService;

    @PostMapping("/models/{key}")
    public TestModel createModel(@PathVariable String key, @RequestParam String info) {
        TestModel model = new TestModel(info);
        TestModel testModel = testService.createTestModel(key, model);
        return testModel;
    }

    @PutMapping("/models/{key}")
    public TestModel updateModel(@PathVariable String key, TestModel t, @RequestParam(required = false) String info) {
        TestModel model = new TestModel(t.getInfo());
        TestModel testModel = testService.updateTestModel(key, model);
        return testModel;
    }

    @GetMapping("/models/{key}")
    public TestModel getModel(@PathVariable String key) {
        return testService.getTestModel(key);
    }
}
