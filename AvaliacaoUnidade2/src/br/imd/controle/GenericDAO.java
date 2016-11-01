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

/**
 *
 * @author eltonviana
 */
public interface GenericDAO {

    void inserir(Pessoa p);

    void inserir(Fornecedor f);

    void inserir(Empregado e);

    void inserir(Setor s);
}
