package com.softdevguide.designstrategies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;

import com.softdevguide.common.model.User;
import com.softdevguide.designstrategies.service.UserService;

@SpringBootApplication
@EntityScan("com.softdevguide.common")
public class DesignStrategiesApplication {

	public static void main(String[] args) {
		ApplicationContext app = SpringApplication.run(DesignStrategiesApplication.class, args);
		UserService userService = app.getBean(UserService.class);
		User user = userService.save(new User("John", "Smith", "john", "john123"));
		System.out.println(user);
	}
}
