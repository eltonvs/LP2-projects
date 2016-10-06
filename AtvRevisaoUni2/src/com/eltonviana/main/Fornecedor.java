package com.eltonviana.main;

public class Fornecedor {
	private String nome;
	private String senha;
	private String cidade;

	public Fornecedor(String nome, String senha, String cidade) {
		super();
		this.nome = nome;
		this.senha = senha;
		this.cidade = cidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
}
