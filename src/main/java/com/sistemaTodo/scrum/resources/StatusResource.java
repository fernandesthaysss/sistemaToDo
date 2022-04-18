package com.sistemaTodo.scrum.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sistemaTodo.scrum.services.StatusService;
import com.sistemaTodo.srum.entities.Status;

@RequestMapping(value = "/status")
@RestController
public class StatusResource {
	
	@Autowired
	private StatusService service;
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<Status>> findAll() {
		List<Status> list = service.findAll();
		
		
		return ResponseEntity.ok().body(list);
		
	}
	
	@GetMapping(value = "/{idStatus}")
	public ResponseEntity<Status> findById(@PathVariable int idStatus){
	Status obj = service.findById(idStatus);	
	return ResponseEntity.ok().body(obj);
	
	}

}
