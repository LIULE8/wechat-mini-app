package com.leo.services;

import com.leo.dtos.TestDTO;
import com.leo.entities.Test;

import java.util.List;

public interface TestService {

    List<Test> test();

    void save(TestDTO testDto);
}
