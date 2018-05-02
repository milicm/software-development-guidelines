package com.softdevguide.generalprinciples.repository;

import java.util.LinkedList;
import java.util.List;

import com.softdevguide.common.model.Person;

public class PersonRepositoryImpl implements PersonRepository {
	private List<Person> personList = new LinkedList<>();

	@Override
	public void addPerson(Person person) {
		personList.add(person);
	}

	@Override
	public void removePerson(Person person) {
		personList.remove(person);
	}

}
