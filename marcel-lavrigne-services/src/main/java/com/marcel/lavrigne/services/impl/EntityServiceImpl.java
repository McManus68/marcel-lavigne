package com.marcel.lavrigne.services.impl;

import com.marcel.lavrigne.model.MarcelLavrigneEntity;
import com.marcel.lavrigne.services.EntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public abstract class EntityServiceImpl<T extends MarcelLavrigneEntity> implements EntityService<T> {

    @Autowired
    JpaRepository<T, Long> repo;

    @Override
    public List<T> getAll() {
        return repo.findAll();
    }

    @Override
    public T get(Long id) {
        return repo.findById(id).get();
    }

    @Override
    public Long add(T entity) {
        return repo.save(entity).getId();
    }

    @Override
    public T save(T entity) {
        return repo.save(entity);
    }

    @Override
    public Long update(T entity) {
        return repo.save(entity).getId();
    }

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }

    @Override
    public void delete(T entity) {
        repo.delete(entity);
    }
}
