package com.sistemaTodo.srum.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Gestor implements Serializable{
	
	
	private static final long serialVersionUID = 4281953151348372246L;

	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Column(name = "ID_GESTOR")
	private String idGestor;
	
	private int    senha;
	private String cargo;
	
	public Gestor() {
		
	}
	
	public String getIdGestor() {
		return idGestor;
	}

	public void setIdGestor(String idGestor) {
		this.idGestor = idGestor;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Gestor(String idGestor, int senha, String cargo) {
		super();
		this.idGestor = idGestor;
		this.senha = senha;
		this.cargo = cargo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cargo, idGestor, senha);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gestor other = (Gestor) obj;
		return Objects.equals(cargo, other.cargo) && Objects.equals(idGestor, other.idGestor) && senha == other.senha;
	}
	

}
