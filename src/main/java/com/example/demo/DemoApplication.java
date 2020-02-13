package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import controller.CampaignsController;
import controller.RecipientController;
import repository.CampaignsRepository;
import repository.RecipientRepository;

@SpringBootApplication
@ComponentScan(basePackageClasses = { CampaignsController.class, RecipientController.class })
@EnableJpaRepositories(basePackageClasses = { CampaignsRepository.class, RecipientRepository.class })
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
