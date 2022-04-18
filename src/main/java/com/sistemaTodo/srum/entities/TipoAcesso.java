package com.sistemaTodo.srum.entities;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class TipoAcesso implements Serializable{
	
	private static final long serialVersionUID = -2944509077462647306L;

	@EmbeddedId
    private TipoAcessoPK pk = new TipoAcessoPK();
	
	 @OneToOne
	 @JoinColumn(name = "ID_FUNCIONARIO", referencedColumnName = "ID_FUNCIONARIO", nullable = false, updatable = false, insertable = false)
	 private Funcionario funcionario;
	 
	 @OneToOne
	 @JoinColumn(name = "ID_GESTOR", referencedColumnName = "ID_GESTOR", nullable = false, updatable = false, insertable = false)
	 private Gestor gestor;

}
