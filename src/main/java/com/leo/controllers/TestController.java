package com.leo.controllers;

import com.leo.dtos.TestDTO;
import com.leo.entities.Test;
import com.leo.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping
    public List<Test> test() {
        return testService.test();
    }

    @PostMapping
    public void save(@RequestBody TestDTO testDTO) {
        testService.save(testDTO);
    }
}
