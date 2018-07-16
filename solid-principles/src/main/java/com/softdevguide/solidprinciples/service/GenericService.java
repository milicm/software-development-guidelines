package com.softdevguide.solidprinciples.service;

import java.util.LinkedList;
import java.util.List;

public abstract class GenericService<T> implements IGenericService<T> {

	private List<T> list = new LinkedList<>();

	@Override
	public final T save(T entity) {
		validate(entity);
		list.add(entity);
		return entity;
	}

	protected abstract void validate(T entity) throws RuntimeException;

}
