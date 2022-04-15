package com.sistemaTodo.scrum.resources;

import java.time.Instant;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sistemaTodo.srum.entities.Estoria;

@RequestMapping(value = "/estoria")
@RestController
public class EstoriaResource {
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<Estoria> findAll() {
		
		Estoria estoria = new Estoria(1,Instant.parse("2019-06-20T19:53:07Z"),Instant.parse("2019-06-20T19:53:07Z"),Instant.parse("2022-06-20T19:53:07Z"),"Manter os arquivos validados de acordo com a especificação");
		return ResponseEntity.ok().body(estoria);
		

	}

}
