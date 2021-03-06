package com.sistemaTodo.scrum.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sistemaTodo.scrum.services.GestorService;
import com.sistemaTodo.srum.entities.Gestor;

@RequestMapping(value = "/gestor")
@RestController
public class GestorResource {
	
	@Autowired
	private GestorService service;
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<Gestor>> findAll() {
		List<Gestor> list = service.findAll();
		
		return ResponseEntity.ok().body(list);

	}
	
	@GetMapping(value = "/{idGestor}")
	public ResponseEntity<Gestor> findById(@PathVariable String idGestor){
	Gestor obj = service.findById(idGestor);	
	return ResponseEntity.ok().body(obj);
	}

}
