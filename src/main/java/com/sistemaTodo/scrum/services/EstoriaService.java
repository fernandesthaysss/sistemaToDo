package com.sistemaTodo.scrum.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistemaTodo.scrum.repositories.EstoriaRepository;
import com.sistemaTodo.srum.entities.Estoria;

@Service
public class EstoriaService {
	
	@Autowired
	private EstoriaRepository repository;
	
	public List<Estoria> findAll(){
		return repository.findAll();
	}
	
	public Estoria findById(int idEstoria) {
		Optional <Estoria> obj = repository.findById(idEstoria);
		return obj.get();
	}

}
