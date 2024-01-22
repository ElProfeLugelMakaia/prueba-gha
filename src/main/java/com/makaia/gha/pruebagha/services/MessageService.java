package com.makaia.gha.pruebagha.services;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class MessageService {

    private Map<String, String> messages;

    public MessageService() {
        this.messages = new HashMap<>();
        this.messages.put("hello", "Hola panas de Makaia!");
        this.messages.put("bye", "Todo bien mis panas de Makaia!");
        this.messages.put("personalized", "Hola :name, espero que estés bien");
    }
    public String sayMessage(String messageKey){
        if(messageKey == null) {
            throw new RuntimeException("La llave del mensaje no puede ser nula");
        }

        if(messageKey.length() > 15){
            throw new RuntimeException("La longitud de la llave del mensaje no puede ser mayor a 15");
        }

        return this.messages.get(messageKey);
    }

    public String personalizedMessage(String name){
        return  this.messages.get("personalized").replace(":name", name);
    }


}
