package com.sistemaTodo.scrum.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sistemaTodo.srum.entities.Gestor;

@RequestMapping(value = "/gestor")
@RestController
public class GestorResource {
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<Gestor> findAll() {
		
		Gestor gestor = new Gestor("t.costa.fernandes@gmail.com",12345678,"Analista desenvolvedor Pleno");
		return ResponseEntity.ok().body(gestor);
		

	}

}
