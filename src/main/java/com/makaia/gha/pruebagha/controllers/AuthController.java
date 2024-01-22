package com.makaia.gha.pruebagha.controllers;

import com.makaia.gha.pruebagha.models.ErrorResponseDto;
import com.makaia.gha.pruebagha.models.LoginRequestDto;
import com.makaia.gha.pruebagha.models.LoginResponseDto;
import com.makaia.gha.pruebagha.entities.User;
import com.makaia.gha.pruebagha.security.JwtUtil;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/api/v1/auth")
public class AuthController {

    private final AuthenticationManager authenticationManager;

    private JwtUtil jwtUtil;

    public AuthController(AuthenticationManager authenticationManager, JwtUtil jwtUtil) {
        this.authenticationManager = authenticationManager;
        this.jwtUtil = jwtUtil;

    }

    @ResponseBody
    @PostMapping(value = "/login")
    public ResponseEntity login(@RequestBody @Valid LoginRequestDto loginReq) {
        try {
            Authentication authentication =
                    authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginReq.getEmail(), loginReq.getPassword()));
            String email = authentication.getName();
            User user = new User(email, "");
            user.setFirstName("Lugel");
            user.setLastName("Franco");
            String token = jwtUtil.createToken(user);
            LoginResponseDto loginRes = new LoginResponseDto(email, token);

            return ResponseEntity.ok(loginRes);
        } catch (BadCredentialsException e) {
            ErrorResponseDto errorResponse = new ErrorResponseDto(HttpStatus.BAD_REQUEST, "Invalid username or password");
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
        } catch (Exception e) {
            ErrorResponseDto errorResponse = new ErrorResponseDto(HttpStatus.BAD_REQUEST, e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
        }
    }

    @ResponseBody
    @PostMapping("/user-validation")
    public String userValidation(@Valid @RequestBody LoginRequestDto loginReq) {
        try {
            return "User is valid";
        } catch (Exception e) {
            return "error";
        }
    }
}