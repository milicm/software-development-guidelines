package com.softdevguide.solidprinciples.service;

import java.util.Optional;

import com.softdevguide.common.model.Person;

public interface PersonService {

	Person save(Person person);

	Person update(Person person);

	void delete(long id);

	Optional<Person> find(long id);

	Iterable<Person> findAll();

}
