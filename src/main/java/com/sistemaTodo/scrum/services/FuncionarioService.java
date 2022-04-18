package com.sistemaTodo.scrum.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistemaTodo.scrum.repositories.FuncionarioRepository;
import com.sistemaTodo.srum.entities.Funcionario;

@Service
public class FuncionarioService {

	@Autowired
	private FuncionarioRepository repository;
	
	public List<Funcionario> findAll(){
		return repository.findAll();
	}
	
	public Funcionario findById(String emailIdFunc) {
		Optional <Funcionario> obj = repository.findById(emailIdFunc);
		return obj.get();
	}
}
