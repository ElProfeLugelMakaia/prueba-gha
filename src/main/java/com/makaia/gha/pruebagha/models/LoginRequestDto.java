package com.makaia.gha.pruebagha.models;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class LoginRequestDto {

    @NotBlank(message = "Name is mandatory")
    private String email;

    @NotBlank(message = "Password is mandatory")
    private String password;

    @Min(value = 18, message = "El usuario debe ser mayor de edad")
    private  int number;

    public LoginRequestDto(String email, String password, int number) {
        this.email = email;
        this.password = password;
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}