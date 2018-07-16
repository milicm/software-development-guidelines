package com.softdevguide.solidprinciples.service.impl;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.softdevguide.common.model.City;
import com.softdevguide.solidprinciples.repository.CityRepository;
import com.softdevguide.solidprinciples.service.CityService;

@Service
public class CityServiceImpl implements CityService {

	private CityRepository cityRepository;

	public CityServiceImpl(CityRepository cityRepository) {
		super();
		this.cityRepository = cityRepository;
	}

	@Override
	public City save(City city) {
		return cityRepository.save(city);
	}

	@Override
	public City update(City city) {
		return cityRepository.save(city);
	}

	@Override
	public void delete(long id) {
		cityRepository.deleteById(id);
	}

	@Override
	public Optional<City> find(long id) {
		return cityRepository.findById(id);
	}

	@Override
	public Iterable<City> findAll() {
		return cityRepository.findAll();
	}

}
