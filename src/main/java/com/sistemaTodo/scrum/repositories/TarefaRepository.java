package com.sistemaTodo.scrum.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistemaTodo.srum.entities.Tarefa;

public interface TarefaRepository extends JpaRepository<Tarefa, Integer>{

}
