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
public class Empregado extends Pessoa {

    private Setor setor;
    private double salarioBase;
    private int imposto;

    public Empregado(Setor setor, double salarioBase, int imposto, String nome, String endereco, String telefone, String sexo, int anoNascimento) throws ValoresNegativosException, FaltandoDadosException {
        super(nome, endereco, telefone, sexo, anoNascimento);

        if (setor == null) {
            throw new FaltandoDadosException("Faltando o setor.");
        }
        this.setor = setor;

        if (salarioBase < 0) {
            throw new ValoresNegativosException("O valor do salário base é inválido");
        }

        this.salarioBase = salarioBase;

        if (imposto < 0) {
            throw new ValoresNegativosException("O valor do imposto é inválido");
        }
        this.imposto = imposto;
    }

    public Setor getSetor() {
        return setor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public int getImposto() {
        return imposto;
    }

    public void setSetor(Setor setor) throws FaltandoDadosException {
        if (setor == null) {
            throw new FaltandoDadosException("Faltando o setor.");
        }
        this.setor = setor;
    }

    public void setSalarioBase(double salarioBase) throws ValoresNegativosException {
        if (salarioBase < 0) {
            throw new ValoresNegativosException("O valor do salário base é inválido");
        }
        this.salarioBase = salarioBase;
    }

    public void setImposto(int imposto) throws ValoresNegativosException {
        if (imposto < 0) {
            throw new ValoresNegativosException("O valor do imposto é inválido");
        }
        this.imposto = imposto;
    }

    public double calcularSalario() {
        return salarioBase * (100 - imposto) / 100.0;
    }

    @Override
    public String toString() {
        return "Empregado{" + "setor=" + setor + ", salarioBase=" + salarioBase + ", imposto=" + imposto + ", salarioLiquido=" + calcularSalario() + '}';
    }

}
