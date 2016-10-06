package com.eltonviana.main;

import java.util.ArrayList;

public class Repositorio {
	protected ArrayList<Funcionario> banco;

	public Repositorio() {
		this.banco = new ArrayList<Funcionario>();
	}

	public ArrayList<Funcionario> getBanco() {
		return banco;
	}

	public void setBanco(ArrayList<Funcionario> banco) {
		this.banco = banco;
	}
}
