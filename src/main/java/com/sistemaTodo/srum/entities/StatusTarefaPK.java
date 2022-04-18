package com.sistemaTodo.srum.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class StatusTarefaPK implements Serializable{
	
	@Column(name = "ID_STATUS", nullable = false)
	private boolean idStatus;
	
	@Column(name = "ID_TAREFA", nullable = false)
	private int 	idTarefa;

	public StatusTarefaPK() {
		
	}

	public StatusTarefaPK(boolean idStatus, int idTarefa) {
		super();
		this.idStatus = idStatus;
		this.idTarefa = idTarefa;
	}

	public boolean isIdStatus() {
		return idStatus;
	}

	public void setIdStatus(boolean idStatus) {
		this.idStatus = idStatus;
	}

	public int getIdTarefa() {
		return idTarefa;
	}

	public void setIdTarefa(int idTarefa) {
		this.idTarefa = idTarefa;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idStatus, idTarefa);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StatusTarefaPK other = (StatusTarefaPK) obj;
		return idStatus == other.idStatus && idTarefa == other.idTarefa;
	}

	
}
