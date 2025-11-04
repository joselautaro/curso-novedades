package com.curso.controller;

import java.util.StringJoiner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/env")
public class TresEnvController {
    

    @Value("${server.port:8080}")
    private String serverPort;

    private final Environment env;

    public TresEnvController(Environment env) {this.env = env;}

    @GetMapping

    public String getEnv(){
        String profile = env.getProperty("spring.profiles.active", "default");

        StringJoiner sj = new StringJoiner("<br/>");

        sj.add("Profile activo: <b>" + profile + "</b>");

        sj.add("Puerto servidor: <b>" + serverPort + "</b>");

        sj.add("Propiedad personalizada app.name: <b>" + env.getProperty("app.name", "-no-name-") + "</b>");

        return "<html> <body><h3>Información del entorno</h3>" + sj.toString() + "</body></html>";
    }

}
