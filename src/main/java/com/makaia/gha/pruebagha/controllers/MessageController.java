package com.makaia.gha.pruebagha.controllers;

import com.makaia.gha.pruebagha.config.GlobalConfig;
import com.makaia.gha.pruebagha.services.MessageService;
import com.makaia.gha.pruebagha.services.UtilsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/message")
public class MessageController {

    @Autowired
    MessageService service;

    @Autowired
    GlobalConfig config;

    @GetMapping("hello")
    public String sayHello(){
        return this.service.sayMessage("hello") + this.config.getMakaiaPresentation();
    }

    @GetMapping("bye")
    public String sayBye(){
        return this.service.sayMessage("bye");
    }

    @GetMapping("personalized/{name}")
    public String personalized(@PathVariable("name") String name){
        return this.service.personalizedMessage(UtilsService.transformTextToUppercase(name));
    }

}
