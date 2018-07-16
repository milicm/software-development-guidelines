package com.softdevguide.solidprinciples.service;

public interface IGenericService<T> {

	T save(T entity);

}
