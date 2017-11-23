package com.marcel.lavigne.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marcel.lavigne.model.Event;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {

}
