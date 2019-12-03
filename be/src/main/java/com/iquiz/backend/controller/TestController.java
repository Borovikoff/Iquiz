package com.iquiz.backend.controller;

import com.iquiz.backend.entity.TestsEntity;
import com.iquiz.backend.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/test")
public class TestController {
    private TestService testService;

    @Autowired
    public TestController(TestService testService) {
        this.testService = testService;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<TestsEntity> getTestById(@PathVariable(name = "id") Integer id) {
        Optional<TestsEntity> testsEntity = testService.getTestById(id);
        if (testsEntity.isPresent()) {
            return ResponseEntity.ok(testsEntity.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public Iterable<TestsEntity> getAllTest() {
        return testService.getAllTest();
    }

    @RequestMapping(method = RequestMethod.POST)
    public TestsEntity saveTest(@RequestBody TestsEntity test) {
        return testService.saveTest(test);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteTest(@PathVariable(name = "id") Integer id) {
        testService.deleteTest(id);
    }
}
