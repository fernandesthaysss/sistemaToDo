package com.sistemaTodo.srum.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class FuncionarioTarefaPK implements Serializable{
	
	@Column(name = "ID_FUNCIONARIO", nullable = false)
	private String IdFuncionario;
	
	@Column(name = "ID_TAREFA", nullable = false)
	private int 	idTarefa;

	public FuncionarioTarefaPK() {
		
	}

	public FuncionarioTarefaPK(String idFuncionario, int idTarefa) {
		super();
		IdFuncionario = idFuncionario;
		this.idTarefa = idTarefa;
	}

	public String getIdFuncionario() {
		return IdFuncionario;
	}

	public void setIdFuncionario(String idFuncionario) {
		IdFuncionario = idFuncionario;
	}

	public int getIdTarefa() {
		return idTarefa;
	}

	public void setIdTarefa(int idTarefa) {
		this.idTarefa = idTarefa;
	}

	@Override
	public int hashCode() {
		return Objects.hash(IdFuncionario, idTarefa);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FuncionarioTarefaPK other = (FuncionarioTarefaPK) obj;
		return Objects.equals(IdFuncionario, other.IdFuncionario) && idTarefa == other.idTarefa;
	}
	
}
