package com.learn.eventsnow.repository;

import com.learn.eventsnow.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event,Integer> {

}
