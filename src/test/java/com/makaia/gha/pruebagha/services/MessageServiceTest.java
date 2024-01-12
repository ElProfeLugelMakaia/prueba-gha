package com.makaia.gha.pruebagha.services;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MessageServiceTest {

    MessageService service;

    @BeforeEach
    void beforeEach() {
        this.service = new MessageService();
    }

    @Test
    void sayHelloTest() {
        // Arrange
        String expectedMessage = "Hola panas de Makaia!";

        // Act
        String actualMessage = this.service.sayHello();

        // Assert
        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    void sayByeTest() {
        // Arrange
        String expectedMessage = "Todo bien mis panas de Makaia!";

        // Act
        String actualMessage = this.service.sayBye();

        // Assert
        assertEquals(expectedMessage, actualMessage);
    }
}