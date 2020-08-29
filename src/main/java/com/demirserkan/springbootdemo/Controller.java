package com.demirserkan.springbootdemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class Controller {

    @GetMapping("/hello")
    public String hello (){
        return "Hello World!";
    }

    @PostMapping("/message")
    public void showMessage(String message){
        log.info("The message in the request is "+message);
    }
}
