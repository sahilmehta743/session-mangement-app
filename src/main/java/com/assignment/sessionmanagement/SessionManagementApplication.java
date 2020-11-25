package com.assignment.sessionmanagement;

import com.assignment.sessionmanagement.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackageClasses = UserRepository.class)
@SpringBootApplication
public class SessionManagementApplication {
	public static void main(String[] args) {
		SpringApplication.run(SessionManagementApplication.class, args);
	}
}
