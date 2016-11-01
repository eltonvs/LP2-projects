/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.imd.modelo;

import br.imd.controle.FaltandoDadosException;
import br.imd.controle.ValoresNegativosException;

/**
 *
 * @author eltonviana
 */
public class Pessoa {

    protected String nome;
    protected String endereco;
    protected String telefone;
    protected String sexo;
    protected int anoNascimento;

    public Pessoa(String nome, String endereco, String telefone, String sexo, int anoNascimento) throws ValoresNegativosException, FaltandoDadosException {
        if (nome == null || endereco == null || telefone == null || sexo == null) {
            throw new FaltandoDadosException("Faltando dados.");
        }

        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.sexo = sexo;

        if (anoNascimento < 0) {
            throw new ValoresNegativosException("O ano de nascimento é inválido.");
        }
        this.anoNascimento = anoNascimento;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getSexo() {
        return sexo;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setAnoNascimento(int anoNascimento) throws ValoresNegativosException {
        if (anoNascimento < 0) {
            throw new ValoresNegativosException("O ano de nascimento é inválido.");
        }
        this.anoNascimento = anoNascimento;
    }

    public int calcularIdade(int ano) throws ValoresNegativosException {
        if (ano < 0) {
            throw new ValoresNegativosException("O ano informado é inválido.");
        }
        return ano - anoNascimento;
    }

    @Override
    public String toString() {
        try {
            return "Pessoa{" + "nome=" + nome + ", endereco=" + endereco + ", telefone=" + telefone + ", sexo=" + sexo + ", idade=" + calcularIdade(2016) + '}';
        } catch (ValoresNegativosException ex) {
            return "Pessoa{" + "nome=" + nome + ", endereco=" + endereco + ", telefone=" + telefone + ", sexo=" + sexo + '}';
        }
    }

}
