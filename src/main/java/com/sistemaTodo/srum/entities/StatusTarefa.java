package com.sistemaTodo.srum.entities;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class StatusTarefa implements Serializable {
	
	    private static final long serialVersionUID = -6147366158732632061L;

		@EmbeddedId
	    private StatusTarefaPK pk = new StatusTarefaPK();

	    @OneToOne
	    @JoinColumn(name = "ID_STATUS", referencedColumnName = "ID_STATUS", nullable = false, updatable = false, insertable = false)
	    private Status status;

	    @OneToOne
	    @JoinColumn(name = "ID_TAREFA", referencedColumnName = "ID_TAREFA", nullable = false, updatable = false, insertable = false)
	    private Tarefa tarefa;

	}


