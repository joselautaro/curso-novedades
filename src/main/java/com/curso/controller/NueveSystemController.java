package com.curso.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/system")
public class NueveSystemController {
    @Value("${app.name: Aplicación sin nombre}")
    private String appName;

    // @GetMapping
    // public String getSystemInfo(){
    //     String javaVersion = System.getProperty("java.version");

    //     String os = System.getProperty("os.name");

    //     return """
    //             <h2>Información del sistema</h2>
    //             <p>App: %s appName </p>
    //             <p>Java: %s javaVersion </p>
    //             <p> OS: %s os </p>
    //             """;
    // }

    @GetMapping
	public String getSystemInfo() {
		String javaVersion = System.getProperty("java.version");
		
		String os = System.getProperty("os.name");
		
		String html =
		  """
			    <html>
			    <head>
					<title>Document</title>
				</head>
		        <body>
					<h2>Información del sistema</h2>
					<p>App: %s</p>
					<p>Java: %s</p>
					<p>OS: %s</p>
		        </body>
		    </html>					
			""";
		
		return String.format(html, appName,javaVersion,os);
    }
}
