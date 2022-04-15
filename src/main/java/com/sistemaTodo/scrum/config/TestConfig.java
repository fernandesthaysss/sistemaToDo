package com.sistemaTodo.scrum.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.sistemaTodo.scrum.repositories.TarefaRepository;
import com.sistemaTodo.srum.entities.Tarefa;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private TarefaRepository tarefaRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Tarefa t1 = new Tarefa(1,"WLAO-3914-VALIDAR ARQUIVO DE ENTRADA CADOC",Instant.parse("2019-06-20T19:53:07Z"),Instant.parse("2019-06-20T19:53:07Z"),Instant.parse("2022-06-20T19:53:07Z"),"Manter os arquivos validados de acordo com a especificação","Thays"); 
		Tarefa t2 = new Tarefa(2,"WLAO-3914-VALIDAR ARQUIVO DE ENTRADA CADOC",Instant.parse("2019-06-20T19:53:07Z"),Instant.parse("2019-06-20T19:53:07Z"),Instant.parse("2022-06-20T19:53:07Z"),"Manter os arquivos validados de acordo com a especificação","Thays");

		tarefaRepository.saveAll(Arrays.asList(t1 , t2));
	}

}
