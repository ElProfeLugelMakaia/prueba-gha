package com.makaia.gha.pruebagha.controllers;

import com.makaia.gha.pruebagha.services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/message")
public class MessageController {

    @Autowired
    MessageService service;

    @GetMapping("hello")
    public String sayHello(){
        return this.service.sayHello();
    }

    @GetMapping("bye")
    public String sayBye(){
        return this.service.sayBye();
    }
}
