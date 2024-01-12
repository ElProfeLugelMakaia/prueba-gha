package com.makaia.gha.pruebagha.services;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestServiceTest {

    TestService service;

    @BeforeEach
    void initialize(){
        this.service = new TestService();
    }


    @Test
    void sayHelloTest(){
        String expectedMessage = "Hello mis panas";

        String actualMessage = this.service.sayHello();

        assertEquals(expectedMessage, actualMessage);
    }

}