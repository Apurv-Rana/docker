package com.dokcer.tutorial.docker_test_app;

import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {

    @GetMapping("/greetings")
    public String greetings(@Param("name") String name){
        return "Hello " + name + " !!";
    }
}
