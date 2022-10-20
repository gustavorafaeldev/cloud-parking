package one.digitalinnovation.parking.controller;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class HelloController {

    @GetMapping
    public String hello(){
        return "Hello Dio. Java Dev";
    }
}
