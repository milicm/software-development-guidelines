package com.softdevguide.solidprinciples.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.softdevguide.common.model.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {

}
