package com.sistemaTodo.scrum.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.sistemaTodo.scrum.repositories.EstoriaRepository;
import com.sistemaTodo.scrum.repositories.FuncionarioRepository;
import com.sistemaTodo.scrum.repositories.GestorRepository;
import com.sistemaTodo.scrum.repositories.StatusRepository;
import com.sistemaTodo.scrum.repositories.TarefaRepository;
import com.sistemaTodo.srum.entities.Estoria;
import com.sistemaTodo.srum.entities.Funcionario;
import com.sistemaTodo.srum.entities.Gestor;
import com.sistemaTodo.srum.entities.Status;
import com.sistemaTodo.srum.entities.Tarefa;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private TarefaRepository tarefaRepository;
	
	@Autowired
	private EstoriaRepository estoriaRepository;

	@Autowired
	private FuncionarioRepository funcionarioRepository;
	
	@Autowired
	private StatusRepository statusRepository;
	
	@Autowired
	private GestorRepository gestorRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Tarefa t1 = new Tarefa(1,"WLAO-3914-VALIDAR ARQUIVO DE ENTRADA CADOC",Instant.parse("2019-06-20T19:53:07Z"),Instant.parse("2019-06-20T19:53:07Z"),Instant.parse("2022-06-20T19:53:07Z"),"Manter os arquivos validados de acordo com a especificação","Thays"); 
		Tarefa t2 = new Tarefa(2,"WLAO-3914-VALIDAR ARQUIVO DE ENTRADA CADOC",Instant.parse("2019-06-20T19:53:07Z"),Instant.parse("2019-06-20T19:53:07Z"),Instant.parse("2022-06-20T19:53:07Z"),"Manter os arquivos validados de acordo com a especificação","Thays");
		
		Estoria estoria1 = new Estoria(1,Instant.parse("2019-06-20T19:53:07Z"),Instant.parse("2019-06-20T19:53:07Z"),Instant.parse("2022-06-20T19:53:07Z"),"Manter os arquivos validados de acordo com a especificação");
		Estoria estoria2 = new Estoria(2,Instant.parse("2019-06-20T19:53:07Z"),Instant.parse("2019-06-20T19:53:07Z"),Instant.parse("2022-06-20T19:53:07Z"),"Manter os arquivos validados");
		Estoria estoria3 = new Estoria(3,Instant.parse("2019-06-20T19:53:07Z"),Instant.parse("2019-06-20T19:53:07Z"),Instant.parse("2022-06-20T19:53:07Z"),"Manter os arquivos ");
		
		Funcionario funcionario = new Funcionario("t.costa.fernandes@gmail.com",12345678,"Analista desenvolvedor Pleno","Jonatan souza");
		Funcionario funcionario2 = new Funcionario("t.costa.fernandes@gmail.com",12345678,"Analista desenvolvedor Pleno","Jonatan souza");
		Funcionario funcionario3 = new Funcionario("t.costa.fernandes@gmail.com",12345678,"Analista desenvolvedor Pleno","Jonatan souza");

		Gestor gestor = new Gestor("t.costa.fernandes@gmail.com",12345678,"Analista desenvolvedor Pleno");
		Gestor gestor1 = new Gestor("t.costa.fernandes@gmail.com",12345678,"Analista desenvolvedor Pleno");

		Status status = new Status(1 ,"Manter os arquivos validados de acordo com a especificação");
		Status status1 = new Status(2 ,"Manter os arquivos validados de acordo com a especificação");

		tarefaRepository.saveAll(Arrays.asList(t1 , t2));
		estoriaRepository.saveAll(Arrays.asList(estoria1 , estoria2 , estoria3));
		funcionarioRepository.saveAll(Arrays.asList(funcionario , funcionario2 , funcionario3));
		gestorRepository.saveAll(Arrays.asList( gestor , gestor1));
		statusRepository.saveAll(Arrays.asList(status , status1));

		
	}

}

