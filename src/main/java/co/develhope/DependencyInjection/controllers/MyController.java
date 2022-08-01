package co.develhope.DependencyInjection.controllers;

import co.develhope.DependencyInjection.services.MyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    private final MyService service;

    public MyController(MyService service){
        System.out.println("MyController constructor has been called.");
        this.service = service;
    }

    @GetMapping("/getName")
    public String getName(){
        return service.getName();
    }

    @GetMapping
    public String helloMessage(){
        return "Hello, welcome to the Dependency Injection exercise application.";
    }

}
