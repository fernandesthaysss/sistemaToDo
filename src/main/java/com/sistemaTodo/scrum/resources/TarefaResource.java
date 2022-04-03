package com.sistemaTodo.scrum.resources;

import java.time.Instant;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sistemaTodo.srum.entities.Tarefa;


@RequestMapping(value = "/tarefa")
@RestController
public class TarefaResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<Tarefa> findAll() {
		
		Tarefa t = new Tarefa(1,"WLAO-3914-VALIDAR ARQUIVO DE ENTRADA CADOC",Instant.parse("2019-06-20T19:53:07Z"),Instant.parse("2019-06-20T19:53:07Z"),Instant.parse("2022-06-20T19:53:07Z"),"Manter os arquivos validados de acordo com a especificação","Thays");
		return ResponseEntity.ok().body(t);
		
	}


}
