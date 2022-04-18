package com.sistemaTodo.srum.entities;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class FuncionarioTarefa implements Serializable {
	
	private static final long serialVersionUID = 8309809388601074308L;

	@EmbeddedId
    private FuncionarioTarefaPK pk = new FuncionarioTarefaPK();

    @OneToOne
    @JoinColumn(name = "ID_FUNCIONARIO", referencedColumnName = "ID_FUNCIONARIO", nullable = false, updatable = false, insertable = false)
    private Funcionario funcionario;

    @OneToOne
    @JoinColumn(name = "ID_TAREFA", referencedColumnName = "ID_TAREFA", nullable = false, updatable = false, insertable = false)
    private Tarefa tarefa;

}
