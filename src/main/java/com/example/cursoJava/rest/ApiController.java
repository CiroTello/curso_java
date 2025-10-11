package com.example.cursoJava.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/")
    public String home() {
        return "¡Spring Boot funcionxsa correctamente 🚀!";
    }

    @GetMapping("/hello")
    public String sayHello() {
        return "Hola desde API REST!";
    }

    @GetMapping("/home")
    public String homePage() {
        // Busca un archivo home.html en src/main/resources/templates/
        return "home dsds";
    }
}
