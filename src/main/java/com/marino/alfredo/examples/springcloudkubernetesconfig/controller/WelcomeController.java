package com.marino.alfredo.examples.springcloudkubernetesconfig.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping("/welcome")
public class WelcomeController {

    @Value("${message:Welcome to the Jungle}")
    private String message;

    @GetMapping
    public String getMessage() {
        System.out.println("WelcomeController: " + message);
        return message;
    }
}
