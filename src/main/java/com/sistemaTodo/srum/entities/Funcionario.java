package com.sistemaTodo.srum.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Funcionario implements Serializable {
	
	private static final long serialVersionUID = -1857259952179381130L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String emailIdFunc;

	private int senha;
	private String cargo;
	private String gestorResp;

	public Funcionario() {

	}
	
	public Funcionario(String emailIdFunc, int senha, String cargo, String gestorResp) {
		super();
		this.emailIdFunc = emailIdFunc;
		this.senha = senha;
		this.cargo = cargo;
		this.gestorResp = gestorResp;
	}

	public String getEmailIdFunc() {
		return emailIdFunc;
	}

	public void setEmailIdFunc(String emailIdFunc) {
		this.emailIdFunc = emailIdFunc;
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

	public String getGestorResp() {
		return gestorResp;
	}

	public void setGestorResp(String gestorResp) {
		this.gestorResp = gestorResp;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cargo, emailIdFunc, gestorResp, senha);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		return Objects.equals(cargo, other.cargo) && emailIdFunc == other.emailIdFunc
				&& Objects.equals(gestorResp, other.gestorResp) && senha == other.senha;
	}

}
