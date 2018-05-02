package com.softdevguide.generalprinciples.repository;

import com.softdevguide.common.model.Person;

public interface PersonRepository {

	void addPerson(Person person);

	void removePerson(Person person);

}
