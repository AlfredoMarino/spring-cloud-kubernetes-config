package com.marino.alfredo.examples.springcloudkubernetesconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class SpringCloudKubernetesConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudKubernetesConfigApplication.class, args);
	}

}
