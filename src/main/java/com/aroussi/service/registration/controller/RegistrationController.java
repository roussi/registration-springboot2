package com.aroussi.service.registration.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class RegistrationController {

    @GetMapping("/hello")
    public Mono<String> sayHello(){
        return Mono.just("Hello every one");
    }
}
