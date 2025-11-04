package com.curso.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

record Mensaje(String texto, String autor){}

@RestController
@RequestMapping("/text")
public class SieteTextController {

    @GetMapping
    public String getMensaje(){
        Mensaje m = new Mensaje("Spring Boot sos el mejor", "Amparo");

        return "<h2>" + m.texto() + "</h2><p>Autor: " + m.autor() + "</p>";
    }
        

        // Antes
        // public class Mensaje{
        //     private String texto;
        //     private String autor;
        //     public Mensaje (String texto, String autor){
        //         this.texto = texto;
        //         this.autor = autor;
        //     }
        //     public String getTexto(){return texto;}
        //     public String getAutor(){return autor;}
        // }

}
