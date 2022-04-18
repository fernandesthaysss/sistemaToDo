package com.sistemaTodo.scrum.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sistemaTodo.scrum.services.FuncionarioService;
import com.sistemaTodo.srum.entities.Funcionario;

@RequestMapping(value = "/funcionario")
@RestController
public class FuncionarioResource {
	
	@Autowired
	private FuncionarioService service;
	
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<Funcionario>> findAll() {
		List<Funcionario> list = service.findAll();
		
		return ResponseEntity.ok().body(list);

	}
	
	@GetMapping(value = "/{idFuncionario}")
	public ResponseEntity<Funcionario> findById(@PathVariable String emailIdFunc){
	Funcionario obj = service.findById(emailIdFunc);	
	return ResponseEntity.ok().body(obj);
	}
	
}
