package com.makaia.gha.pruebagha.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.context.annotation.Configuration;

@Configuration
/*
 -> Acá definen el tipo de seguridad que van a utiilizar. Ésta configuración está para JWT, pero deben consultar como hacerlo para autenticación básica
@SecurityScheme(
        type = SecuritySchemeType.HTTP,
        name = "BearerAuth",
        scheme = "bearer",
        bearerFormat = "JWT"
)*/
@OpenAPIDefinition(
        info = @Info(
                title = "API Documentation"
        ),
        servers = {
                @Server(url = "https://prueba-gha-production.up.railway.app/",description = "Production server"),
                @Server(url = "http://localhost:8080",description = "Development server")
        }
)
public class SwaggerConfig {

}