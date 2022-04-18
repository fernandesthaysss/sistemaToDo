package com.sistemaTodo.scrum.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistemaTodo.scrum.repositories.StatusRepository;
import com.sistemaTodo.srum.entities.Status;

@Service
public class StatusService {
	@Autowired
	private StatusRepository repository;
	
	public List<Status> findAll(){
		return repository.findAll();
	}
	
	public Status findById(int idStatus) {
		Optional <Status> obj = repository.findById(idStatus);
		return obj.get();
	}

}
