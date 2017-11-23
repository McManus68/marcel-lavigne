package com.marcel.lavigne.services;

import java.util.List;

import com.marcel.lavigne.model.MarcelLavigneEntity;

public interface EntityService<T extends MarcelLavigneEntity> {

	List<T> getAll();

	T get(Long id);

	Long add(T entity);

	T save(T entity);

	Long update(T entity);

	void delete(Long id);

	void delete(T entity);
}
