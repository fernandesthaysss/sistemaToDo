package com.sistemaTodo.srum.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class TipoAcessoPK implements Serializable {
	
	@Column(name = "ID_FUNCIONARIO", nullable = false)
	private String idFuncionario;
	
	@Column(name = "ID_GESTOR", nullable = false)
	private String 	idGestor;

	public TipoAcessoPK() {
	
	}

	public TipoAcessoPK(String idFuncionario, String idGestor) {
		super();
		this.idFuncionario = idFuncionario;
		this.idGestor = idGestor;
	}

	public String getIdFuncionario() {
		return idFuncionario;
	}

	public void setIdFuncionario(String idFuncionario) {
		this.idFuncionario = idFuncionario;
	}

	public String getIdGestor() {
		return idGestor;
	}

	public void setIdGestor(String idGestor) {
		this.idGestor = idGestor;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idFuncionario, idGestor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TipoAcessoPK other = (TipoAcessoPK) obj;
		return Objects.equals(idFuncionario, other.idFuncionario) && Objects.equals(idGestor, other.idGestor);
	}
}

