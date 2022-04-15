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
	private int 	idTarefa;
	
	private String 	nomeTarefaString;
	private Instant dtCriacao;
	private Instant dtAlteracao;
	private Instant dtExclusao;
	private String 	descricao;
	private String 	devResp;
	
	public Tarefa() {
		
	}

	public int getIdTarefa() {
		return idTarefa;
	}

	public void setIdTarefa(int idTarefa) {
		this.idTarefa = idTarefa;
	}

	public String getNomeTarefaString() {
		return nomeTarefaString;
	}

	public void setNomeTarefaString(String nomeTarefaString) {
		this.nomeTarefaString = nomeTarefaString;
	}

	public Instant getDtCriacao() {
		return dtCriacao;
	}

	public void setDtCriacao(Instant dtCriacao) {
		this.dtCriacao = dtCriacao;
	}

	public Instant getDtAlteracao() {
		return dtAlteracao;
	}

	public void setDtAlteracao(Instant dtAlteracao) {
		this.dtAlteracao = dtAlteracao;
	}

	public Instant getDtExclusao() {
		return dtExclusao;
	}

	public void setDtExclusao(Instant dtExclusao) {
		this.dtExclusao = dtExclusao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDevResp() {
		return devResp;
	}

	public void setDevResp(String devResp) {
		this.devResp = devResp;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Tarefa(int idTarefa, String nomeTarefaString, Instant dtCriacao, Instant dtAlteracao, Instant dtExclusao,
			String descricao, String devResp) {
		super();
		this.idTarefa = idTarefa;
		this.nomeTarefaString = nomeTarefaString;
		this.dtCriacao = dtCriacao;
		this.dtAlteracao = dtAlteracao;
		this.dtExclusao = dtExclusao;
		this.descricao = descricao;
		this.devResp = devResp;
	}

	@Override
	public int hashCode() {
		return Objects.hash(descricao, devResp, dtAlteracao, dtCriacao, dtExclusao, idTarefa, nomeTarefaString);
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
		return Objects.equals(descricao, other.descricao) && Objects.equals(devResp, other.devResp)
				&& Objects.equals(dtAlteracao, other.dtAlteracao) && Objects.equals(dtCriacao, other.dtCriacao)
				&& Objects.equals(dtExclusao, other.dtExclusao) && idTarefa == other.idTarefa
				&& Objects.equals(nomeTarefaString, other.nomeTarefaString);
	}
	
	
}