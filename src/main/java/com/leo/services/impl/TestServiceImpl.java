package com.leo.services.impl;

import com.leo.dtos.TestDTO;
import com.leo.entities.Test;
import com.leo.repositories.TestRepository;
import com.leo.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestRepository repository;

    @Override
    public List<Test> test() {
        return repository.findAll();
    }

    @Override
    public void save(TestDTO testDto) {
        Test test = new Test();
        test.setName(testDto.getName());
        repository.save(test);
    }
}
