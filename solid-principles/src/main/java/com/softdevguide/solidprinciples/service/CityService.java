package com.softdevguide.solidprinciples.service;

import java.util.Optional;

import com.softdevguide.common.model.City;

public interface CityService {

	City save(City city);

	City update(City city);

	void delete(long id);

	Optional<City> find(long id);

	Iterable<City> findAll();

}
