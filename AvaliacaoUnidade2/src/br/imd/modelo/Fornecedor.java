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
public class Fornecedor extends Pessoa {

    private double valorCredito;
    private double valorDivida;

    public Fornecedor(double valorCredito, double valorDivida, String nome, String endereco, String telefone, String sexo, int anoNascimento) throws ValoresNegativosException, FaltandoDadosException {
        super(nome, endereco, telefone, sexo, anoNascimento);
        if (valorCredito < 0) {
            throw new ValoresNegativosException("O valor do valor de crédito é inválido");
        }
        this.valorCredito = valorCredito;

        if (valorDivida < 0) {
            throw new ValoresNegativosException("O valor do valor da dívida é inválido");
        }
        this.valorDivida = valorDivida;
    }

    public double getValorCredito() {
        return valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorCredito(double valorCredito) throws ValoresNegativosException {
        if (valorCredito < 0) {
            throw new ValoresNegativosException("O valor de crédito é inválido");
        }
        this.valorCredito = valorCredito;
    }

    public void setValorDivida(double valorDivida) throws ValoresNegativosException {
        if (valorDivida < 0) {
            throw new ValoresNegativosException("O valor da dívida é inválido");
        }
        this.valorDivida = valorDivida;
    }

    public double obterSaldo() {
        return valorCredito - valorDivida;
    }

    @Override
    public String toString() {
        return "Fornecedor{" + "valorCredito=" + valorCredito + ", valorDivida=" + valorDivida + ", saldo=" + obterSaldo() + '}';
    }

}
