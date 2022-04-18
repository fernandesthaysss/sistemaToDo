package com.sistemaTodo.scrum.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistemaTodo.scrum.repositories.TarefaRepository;
import com.sistemaTodo.srum.entities.Tarefa;

@Service
public class TarefaService {
	
	@Autowired
	private TarefaRepository repository;
	
	public List<Tarefa> findAll(){
		return repository.findAll();
	}
	
	public Tarefa findById(int idTarefa) {
		Optional <Tarefa> obj = repository.findById(idTarefa);
		return obj.get();
	}
}
