package com.sistemaTodo.srum.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Estoria implements Serializable {

	
	private static final long serialVersionUID = 1205223910717566562L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int 	idEstoria;
	
	private Instant dtCriacao;
	private Instant dtAlteracao;
	private Instant dtExclusao;
	private String 	descricao;
	
	public Estoria() {
		
	}

	public Estoria(int idEstoria, Instant dtCriacao, Instant dtAlteracao, Instant dtExclusao, String descricao) {
		super();
		this.idEstoria = idEstoria;
		this.dtCriacao = dtCriacao;
		this.dtAlteracao = dtAlteracao;
		this.dtExclusao = dtExclusao;
		this.descricao = descricao;
	}

	public int getIdEstoria() {
		return idEstoria;
	}

	public void setIdEstoria(int idEstoria) {
		this.idEstoria = idEstoria;
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

	@Override
	public int hashCode() {
		return Objects.hash(descricao, dtAlteracao, dtCriacao, dtExclusao, idEstoria);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estoria other = (Estoria) obj;
		return Objects.equals(descricao, other.descricao) && Objects.equals(dtAlteracao, other.dtAlteracao)
				&& Objects.equals(dtCriacao, other.dtCriacao) && Objects.equals(dtExclusao, other.dtExclusao)
				&& idEstoria == other.idEstoria;
	}
	
	
	
	
	
	
	
}



