package org.bedu.backend.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    
    @RequestMapping("/hello")
    public String helloWorld() {
        return "Hello World";
    }

    @RequestMapping("/goodbye")
    public String goodBye() {
        return "Good Bye";
    }

    @RequestMapping("/html")
    public String html() {
        return "<h1>Esto es un HTML</html>";
    }
}
