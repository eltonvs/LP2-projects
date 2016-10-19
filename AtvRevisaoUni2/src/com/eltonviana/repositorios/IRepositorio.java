package com.eltonviana.repositorios;

import com.eltonviana.exceptions.AtualizarFuncionarioException;
import com.eltonviana.exceptions.DeletarFuncionarioException;
import com.eltonviana.main.Funcionario;

public interface IRepositorio {
	void inserirFuncionario(Funcionario f);

	void deletarFuncionario(int matricula) throws DeletarFuncionarioException;

	void atualizarFuncionario(int matricula, String cpf) throws AtualizarFuncionarioException;

	Funcionario buscarFuncionario(int matricula);

	void listarFuncionarios();
}
