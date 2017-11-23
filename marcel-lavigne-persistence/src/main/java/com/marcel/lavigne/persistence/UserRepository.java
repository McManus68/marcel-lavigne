package com.marcel.lavigne.persistence;

import com.marcel.lavigne.model.User;

import java.util.Optional;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
 
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Cacheable(value = "loginWithSettings")
    User findByLogin(@Param("login") String login);

    Optional<User> findById(Long id);
    User findByMail(String mail);

    @Override
    @SuppressWarnings("unchecked")
    @CacheEvict(value = "loginWithSettings", allEntries = true)
    User save(User entity);
}
