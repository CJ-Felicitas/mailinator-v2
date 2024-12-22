package com.myralla.mailinator;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableRabbit
@EnableAsync
public class MailinatorApplication {
	public static void main(String[] args) {
		SpringApplication.run(MailinatorApplication.class, args);
	}
}
