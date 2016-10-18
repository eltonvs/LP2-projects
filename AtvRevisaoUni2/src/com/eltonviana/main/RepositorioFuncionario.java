package com.eltonviana.main;

public class RepositorioFuncionario implements IRepositorio {
	private Repositorio repo;

	public Repositorio getRepo() {
		return repo;
	}

	public void setRepo(Repositorio repo) {
		this.repo = repo;
	}

	public RepositorioFuncionario() {
		repo = new Repositorio();
	}

	@Override
	public void inserirFuncionario(Funcionario f) {
		this.repo.getBanco().add(f);
	}

	@Override
	public void deletarFuncionario(int matricula) throws DeletarFuncionarioException {
		for (Funcionario f : this.repo.getBanco()) {
			if (f.getMatricula() == matricula) {
				this.repo.getBanco().remove(f);
				return;
			}
		}

		throw new DeletarFuncionarioException("A matrícula selecionada não consta no Repositório");
	}

	@Override
	public void atualizarFuncionario(int matricula, String cpf) throws AtualizarFuncionarioException {
		int i = -1;
		for (Funcionario f : this.repo.getBanco()) {
			if (f.getMatricula() == matricula && ++i >= 0) {
				this.repo.getBanco().get(i).setCpf(cpf);
				return;
			}
		}

		throw new AtualizarFuncionarioException("A matrícula selecionada não consta no Repositório");
	}

	@Override
	public Funcionario buscarFuncionario(int matricula) {
		for (Funcionario f : this.repo.getBanco()) {
			if (f.getMatricula() == matricula)
				return f;
		}

		return null;
	}

	@Override
	public void listarFuncionarios() {
		System.out.println("Lista de Funcionários:");
		for (Funcionario f : this.repo.getBanco()) {
			System.out.println(f.toString());
		}
	}
}
