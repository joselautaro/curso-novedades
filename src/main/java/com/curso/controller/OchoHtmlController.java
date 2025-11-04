package com.curso.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/html")
public class OchoHtmlController {

    @GetMapping
    public String getHtmlPage(){

        return """
                <html>
                <head>
                <meta>
                <title>Document</title>
                </head>
                <body style='font-family:Arial; text-align:center; margin-top:50px;'>
                    <h1>Podés devolver directamente html desde tu controller</h1>
                </body>
                </html>
                """;
    }

    
}
