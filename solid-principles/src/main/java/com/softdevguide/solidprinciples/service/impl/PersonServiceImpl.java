package com.softdevguide.solidprinciples.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softdevguide.common.model.Person;
import com.softdevguide.solidprinciples.repository.PersonRepository;
import com.softdevguide.solidprinciples.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonRepository personRepository;

	@Override
	public Person save(Person person) {
		return personRepository.save(person);
	}

	@Override
	public Person update(Person person) {
		return personRepository.save(person);
	}

	@Override
	public void delete(long id) {
		personRepository.deleteById(id);
	}

	@Override
	public Optional<Person> find(long id) {
		return personRepository.findById(id);
	}

	@Override
	public Iterable<Person> findAll() {
		return personRepository.findAll();
	}

}
