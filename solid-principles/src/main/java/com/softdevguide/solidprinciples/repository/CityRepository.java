package com.softdevguide.solidprinciples.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.softdevguide.common.model.City;

@Repository
public interface CityRepository extends CrudRepository<City, Long> {

}
