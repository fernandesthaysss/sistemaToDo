package com.sistemaTodo.srum.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tarefa implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int 	id_tarefa;
	
	private String 	nome_tarefaString;
	private Instant dt_criacao;
	private Instant dt_alteracao;
	private Instant dt_exclusao;
	private String 	descricao;
	private String 	dev_resp;
	
	public Tarefa() {
		
	}

	public Tarefa(int id_tarefa, String nome_tarefaString, Instant dt_criacao, Instant dt_alteracao, Instant dt_exclusao,
			String descricao, String dev_resp) {
		super();
		this.id_tarefa = id_tarefa;
		this.nome_tarefaString = nome_tarefaString;
		this.dt_criacao = dt_criacao;
		this.dt_alteracao = dt_alteracao;
		this.dt_exclusao = dt_exclusao;
		this.descricao = descricao;
		this.dev_resp = dev_resp;
	}

	public int getId_tarefa() {
		return id_tarefa;
	}

	public void setId_tarefa(int id_tarefa) {
		this.id_tarefa = id_tarefa;
	}

	public String getNome_tarefaString() {
		return nome_tarefaString;
	}

	public void setNome_tarefaString(String nome_tarefaString) {
		this.nome_tarefaString = nome_tarefaString;
	}

	public Instant getDt_criacao() {
		return dt_criacao;
	}

	public void setDt_criacao(Instant dt_criacao) {
		this.dt_criacao = dt_criacao;
	}

	public Instant getDt_alteracao() {
		return dt_alteracao;
	}

	public void setDt_alteracao(Instant dt_alteracao) {
		this.dt_alteracao = dt_alteracao;
	}

	public Instant getDt_exclusao() {
		return dt_exclusao;
	}

	public void setDt_exclusao(Instant dt_exclusao) {
		this.dt_exclusao = dt_exclusao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDev_resp() {
		return dev_resp;
	}

	public void setDev_resp(String dev_resp) {
		this.dev_resp = dev_resp;
	}

	@Override
	public int hashCode() {
		return Objects.hash(descricao, dev_resp, dt_alteracao, dt_criacao, dt_exclusao, id_tarefa, nome_tarefaString);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tarefa other = (Tarefa) obj;
		return Objects.equals(descricao, other.descricao) && Objects.equals(dev_resp, other.dev_resp)
				&& Objects.equals(dt_alteracao, other.dt_alteracao) && Objects.equals(dt_criacao, other.dt_criacao)
				&& Objects.equals(dt_exclusao, other.dt_exclusao) && id_tarefa == other.id_tarefa
				&& Objects.equals(nome_tarefaString, other.nome_tarefaString);
	}
	
	
	
	
	
	

}
