/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.imd;

import br.imd.controle.DAO;
import br.imd.controle.FaltandoDadosException;
import br.imd.controle.ValoresNegativosException;
import br.imd.modelo.Empregado;
import br.imd.modelo.Fornecedor;
import br.imd.modelo.Pessoa;
import br.imd.modelo.Setor;

/**
 *
 * @author eltonviana
 */
public class Aplicacao {

    public static void main(String[] args) {
        DAO banco = new DAO();
        try {
            Setor s0 = new Setor(0, "blablabla");
            Setor s1 = new Setor(1, "blebleble");
            banco.inserir(new Pessoa("José", "endereço", "9999-9999", "M", 1997));
            banco.inserir(new Pessoa("João", "endereço", "9999-9999", "M", 1998));
            banco.inserir(new Fornecedor(1000, 100, "Chico", "endereço", "9999-9999", "M", 1998));
            banco.inserir(new Fornecedor(100, 100, "Zé", "endereço", "9999-9999", "M", 1998));
            banco.inserir(new Empregado(s0, 1000, 10, "Alberto", "endereço", "9999-9999", "M", 1998));
            banco.inserir(new Empregado(s1, 2000, 20, "Anderson", "endereço", "9999-9999", "M", 1998));
            banco.inserir(s0);
            banco.inserir(s1);
        } catch (ValoresNegativosException e) {
            System.err.println("erro valores negativos");
        } catch (FaltandoDadosException e) {
            System.err.println("erro faltando dados");
        }

        System.out.println("Todos:");
        banco.listarTodos();
        System.out.println("Pessoas:");
        banco.listarPessoas();
        System.out.println("Fornecedores:");
        banco.listarFornecedores();
        System.out.println("Empregados:");
        banco.listarEmpregados();
        System.out.println("Setores:");
        banco.listarSetores();
    }
}
