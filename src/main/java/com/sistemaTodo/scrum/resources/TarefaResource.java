package com.sistemaTodo.scrum.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sistemaTodo.scrum.services.TarefaService;
import com.sistemaTodo.srum.entities.Tarefa;


@RequestMapping(value = "/tarefa")
@RestController
public class TarefaResource {
	
	@Autowired
	private TarefaService service;
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<Tarefa>> findAll() {
		List<Tarefa> list = service.findAll();
		
		return ResponseEntity.ok().body(list);
		
	}
	
	@GetMapping(value = "/{idTarefa}")
	public ResponseEntity<Tarefa> findById(@PathVariable int idTarefa){
	Tarefa obj = service.findById(idTarefa);	
	return ResponseEntity.ok().body(obj);
	}

}
