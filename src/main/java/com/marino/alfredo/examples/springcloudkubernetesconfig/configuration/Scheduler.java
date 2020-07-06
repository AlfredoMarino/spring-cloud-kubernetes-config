package com.marino.alfredo.examples.springcloudkubernetesconfig.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduler {

    @Autowired
    private WelcomeConfiguration welcomeConfiguration;

    @Scheduled(fixedDelay = 3000)
    public void schedule() {
        System.out.println(welcomeConfiguration.getMessage());
    }
}
