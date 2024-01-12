package com.makaia.gha.pruebagha.services;

import org.springframework.stereotype.Service;

@Service
public class MessageService {

    public String sayHello(){
        return "Hola panas de Makaia!";
    }

    public String sayBye(){
        return "Todo bien mis panas de Makaia!";
    }

}
