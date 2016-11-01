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
public class Setor {

    private int codigoSetor;
    private String descricaoSetor;

    public Setor(int codigoSetor, String descricaoSetor) throws ValoresNegativosException, FaltandoDadosException {
        if (descricaoSetor == null) {
            throw new FaltandoDadosException("Faltando a descrição do setor.");
        }
        if (codigoSetor < 0) {
            throw new ValoresNegativosException("O código do setor é inválido");
        }
        this.codigoSetor = codigoSetor;
        this.descricaoSetor = descricaoSetor;
    }

    public int getCodigoSetor() {
        return codigoSetor;
    }

    public String getDescricaoSetor() {
        return descricaoSetor;
    }

    public void setCodigoSetor(int codigoSetor) throws ValoresNegativosException {
        if (codigoSetor < 0) {
            throw new ValoresNegativosException("O código do setor é inválido");
        }
        this.codigoSetor = codigoSetor;
    }

    public void setDescricaoSetor(String descricaoSetor) throws FaltandoDadosException {
        if (descricaoSetor == null) {
            throw new FaltandoDadosException("Faltando a descrição do setor.");
        }
        this.descricaoSetor = descricaoSetor;
    }

    @Override
    public String toString() {
        return "Setor{" + "codigoSetor=" + codigoSetor + ", descricaoSetor=" + descricaoSetor + '}';
    }

}
