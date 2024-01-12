package com.makaia.gha.pruebagha.controllers;

import com.makaia.gha.pruebagha.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/test")
public class TestController {

    private TestService service;

    @Autowired
    public TestController(TestService service) {
        this.service = service;
    }

    @GetMapping()
    public String sayHello(){
        return this.service.sayHello();
    }
}
