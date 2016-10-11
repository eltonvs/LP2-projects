package com.eltonviana.main;

public interface IRepositorio {
	void inserirFuncionario(Funcionario f);

	void deletarFuncionario(int matricula) throws DeletarFuncionarioException;

	void atualizarFuncionario(int matricula, String cpf) throws AtualizarFuncionarioException;

	Funcionario buscarFuncionario(int matricula);

	void listarFuncionarios();
}
