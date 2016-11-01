/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.imd.controle;

import br.imd.modelo.Empregado;
import br.imd.modelo.Fornecedor;
import br.imd.modelo.Pessoa;
import br.imd.modelo.Setor;
import java.util.ArrayList;

/**
 *
 * @author eltonviana
 */
public class DAO implements GenericDAO {

    public static ArrayList<Pessoa> bancoPessoas = new ArrayList<>();
    public static ArrayList<Setor> bancoSetores = new ArrayList<>();

    @Override
    public void inserir(Pessoa p) {
        bancoPessoas.add(p);
    }

    @Override
    public void inserir(Fornecedor f) {
        bancoPessoas.add(f);
    }

    @Override
    public void inserir(Empregado e) {
        bancoPessoas.add(e);
    }

    @Override
    public void inserir(Setor s) {
        bancoSetores.add(s);
    }

    public void listarTodos() {
        for (Pessoa p : bancoPessoas) {
            System.out.println(p.toString());
        }
        for (Setor s : bancoSetores) {
            System.out.println(s.toString());
        }
    }

    public void listarPessoas() {
        for (Pessoa p : bancoPessoas) {
            if (p instanceof Pessoa) {
                System.out.println(p.toString());
            }
        }
    }

    public void listarFornecedores() {
        for (Pessoa p : bancoPessoas) {
            if (p instanceof Fornecedor) {
                System.out.println(p.toString());
            }
        }
    }

    public void listarEmpregados() {
        for (Pessoa p : bancoPessoas) {
            if (p instanceof Fornecedor) {
                System.out.println(p.toString());
            }
        }
    }

    public void listarSetores() {
        for (Setor s : bancoSetores) {
            System.out.println(s.toString());
        }
    }

}
