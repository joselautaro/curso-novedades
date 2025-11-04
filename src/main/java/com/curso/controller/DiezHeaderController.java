package com.curso.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/headers")
public class DiezHeaderController {
    // HttpSerletRequest

    // HttpServerletRequest req;
    // String navegador = req.getHeader("User-Agent")

    @GetMapping
    public String mostrarHeaders(

        @RequestHeader("User-Agent") String navegador,

        @RequestHeader(value = "Accept-Lenguage", defaultValue= "no especificado") String idioma

    ){
        return """
                <h2>Información del navegador</h2>
                <p><b>User-Agent:</b>%s</p>
                <p><b>Idioma preferido:</b>%s</p>
                """.formatted(navegador, idioma);
    }
}
