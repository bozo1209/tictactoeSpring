package com.example.game;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example")
//@ConfigurationPropertiesScan(basePackages = "com.example")
//@EnableConfigurationProperties(SitePathConfiguration.class)
//@EnableAutoConfiguration()
public class TicTacToeSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicTacToeSpringApplication.class, args);
	}

}
