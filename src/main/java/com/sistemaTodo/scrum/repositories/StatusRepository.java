package com.sistemaTodo.scrum.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistemaTodo.srum.entities.Status;

public interface StatusRepository extends JpaRepository<Status , Integer>{

}
