package com.marino.alfredo.examples.springcloudkubernetesconfig.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "welcome")
public class WelcomeConfiguration {

    private String message = "Hello World Spring + kubernetes";

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
