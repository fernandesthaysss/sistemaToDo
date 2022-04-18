package com.sistemaTodo.srum.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Status implements Serializable{
	
	private static final long serialVersionUID = -3736228975897779808L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_STATUS")
	private int idStatus;
	
	private String 	detalheStatus;
			
	public Status() {

	}

	public Status(int idStatus, String detalheStatus) {
		super();
		this.idStatus = idStatus;
		this.detalheStatus = detalheStatus;
	}

	public int getIdStatus() {
		return idStatus;
	}

	public void setIdStatus(int idStatus) {
		this.idStatus = idStatus;
	}

	public String getDetalheStatus() {
		return detalheStatus;
	}

	public void setDetalheStatus(String detalheStatus) {
		this.detalheStatus = detalheStatus;
	}

	@Override
	public int hashCode() {
		return Objects.hash(detalheStatus, idStatus);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Status other = (Status) obj;
		return Objects.equals(detalheStatus, other.detalheStatus) && idStatus == other.idStatus;
	}

}