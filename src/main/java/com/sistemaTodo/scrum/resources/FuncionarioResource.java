package com.sistemaTodo.scrum.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sistemaTodo.srum.entities.Funcionario;

@RequestMapping(value = "/funcionario")
@RestController
public class FuncionarioResource {
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<Funcionario> findAll() {
		
		Funcionario funcionario = new Funcionario("t.costa.fernandes@gmail.com",12345678,"Analista desenvolvedor Pleno","Jonatan souza");
		return ResponseEntity.ok().body(funcionario);
		

	}
}
