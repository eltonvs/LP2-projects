package com.eltonviana.testes;

import com.eltonviana.exceptions.AtualizarFuncionarioException;
import com.eltonviana.exceptions.DeletarFuncionarioException;
import com.eltonviana.main.Funcionario;
import com.eltonviana.repositorios.RepositorioFuncionario;
import static org.junit.Assert.*;

import org.junit.Test;

public class RepositorioFuncionarioTest {

	@Test
	public void testeInserirFuncionario() {
		RepositorioFuncionario rf = new RepositorioFuncionario();
		assertEquals(0, rf.getRepo().getBanco().size());
		rf.inserirFuncionario(new Funcionario(1, "José", "123.123.123-12"));
		assertEquals(1, rf.getRepo().getBanco().size());
	}

	@Test
	public void testeInserirFuncionarios() {
		RepositorioFuncionario rf = new RepositorioFuncionario();
		assertEquals(0, rf.getRepo().getBanco().size());
		rf.inserirFuncionario(new Funcionario(1, "José", "123.123.123-12"));
		rf.inserirFuncionario(new Funcionario(2, "João", "456.456.456-45"));
		rf.inserirFuncionario(new Funcionario(3, "Antônio", "789.789.789-78"));
		assertEquals(3, rf.getRepo().getBanco().size());
	}

	@Test
	public void testeDeletarFuncionarios() throws DeletarFuncionarioException {
		RepositorioFuncionario rf = new RepositorioFuncionario();
		assertEquals(0, rf.getRepo().getBanco().size());
		rf.inserirFuncionario(new Funcionario(1, "José", "123.123.123-12"));
		rf.inserirFuncionario(new Funcionario(2, "João", "456.456.456-45"));
		rf.inserirFuncionario(new Funcionario(3, "Antônio", "789.789.789-78"));

		rf.deletarFuncionario(1);
		assertEquals(2, rf.getRepo().getBanco().size());
	}

	@Test
	public void testeBuscaFuncionario() {
		RepositorioFuncionario rf = new RepositorioFuncionario();
		Funcionario f = new Funcionario(1, "José", "123.123.123-12");
		rf.inserirFuncionario(f);
		assertEquals(f.getMatricula(), rf.buscarFuncionario(1).getMatricula());
		assertEquals(f.getNome(), rf.buscarFuncionario(1).getNome());
		assertEquals(f.getCpf(), rf.buscarFuncionario(1).getCpf());
	}

	@Test
	public void testeAtualizarFuncionario() throws AtualizarFuncionarioException {
		RepositorioFuncionario rf = new RepositorioFuncionario();
		Funcionario f = new Funcionario(1, "José", "123.123.123-12");
		rf.inserirFuncionario(f);
		rf.atualizarFuncionario(1, "456.456.456-45");

		assertEquals("456.456.456-45", rf.buscarFuncionario(1).getCpf());
	}

}
