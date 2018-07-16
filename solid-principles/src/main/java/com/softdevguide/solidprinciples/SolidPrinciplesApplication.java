package com.softdevguide.solidprinciples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;

import com.softdevguide.common.model.City;
import com.softdevguide.common.model.Person;
import com.softdevguide.solidprinciples.service.CityService;
import com.softdevguide.solidprinciples.service.PersonService;

@SpringBootApplication
@EntityScan("com.softdevguide.common")
public class SolidPrinciplesApplication {

	public static void main(String[] args) {
		ApplicationContext app = SpringApplication.run(SolidPrinciplesApplication.class, args);

		CityService cityService = app.getBean(CityService.class);
		PersonService personService = app.getBean(PersonService.class);
		
		City saved = cityService.save(new City("Belgrade"));
		System.out.println(saved);
		Person savedPerson = personService.save(new Person("John Smith", saved));
		System.out.println(savedPerson);
		
		

	}
}
