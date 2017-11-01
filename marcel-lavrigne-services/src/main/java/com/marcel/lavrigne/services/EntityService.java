package com.marcel.lavrigne.services;

import java.util.List;

import com.marcel.lavrigne.model.MarcelLavrigneEntity;

public interface EntityService<T extends MarcelLavrigneEntity> {

	List<T> getAll();

	T get(Long id);

	Long add(T entity);

	T save(T entity);

	Long update(T entity);

	void delete(Long id);

	void delete(T entity);
}
