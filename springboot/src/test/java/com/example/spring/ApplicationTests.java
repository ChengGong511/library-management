package com.example.spring;

import com.spring.Application;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
@ContextConfiguration(classes = Application.class)
class ApplicationTests {

    @Test
    void contextLoads() {
    }

}
