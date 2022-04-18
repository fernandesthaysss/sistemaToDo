package com.sistemaTodo.scrum.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistemaTodo.scrum.repositories.GestorRepository;
import com.sistemaTodo.srum.entities.Gestor;

@Service
public class GestorService {

	@Autowired
	private GestorRepository repository;
	
	public List<Gestor> findAll(){
		return repository.findAll();
	}
	
	public Gestor findById(String idGestor) {
		Optional <Gestor> obj = repository.findById(idGestor);
		return obj.get();
	}
}
