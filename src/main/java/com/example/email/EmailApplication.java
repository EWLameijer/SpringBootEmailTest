package com.example.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmailApplication {

	static EmailService emailService = new EmailService();

	public static void main(String[] args) {

		SpringApplication.run(EmailApplication.class, args);
		emailService.sendEmail("eric_wubbo@hotmail.com","Boot test", "Does it work?");
	}

}
