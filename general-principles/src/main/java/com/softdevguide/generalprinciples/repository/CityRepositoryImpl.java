package com.softdevguide.generalprinciples.repository;

import java.util.LinkedList;
import java.util.List;

import com.softdevguide.common.model.City;

public class CityRepositoryImpl implements CityRepository {

	private List<City> cityList = new LinkedList<>();

	@Override
	public void addCity(City city) {
		cityList.add(city);
	}

	@Override
	public void removeCity(City city) {
		cityList.remove(city);
	}

}
