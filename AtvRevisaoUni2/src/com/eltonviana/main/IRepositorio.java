package com.eltonviana.main;

public interface IRepositorio {
	void inserirFuncionario(Funcionario f);

	void deletarFuncionario(int matricula);

	void atualizarFuncionario(int matricula, String cpf);

	Funcionario buscarFuncionario(int matricula);

	void listarFuncionarios();
}
