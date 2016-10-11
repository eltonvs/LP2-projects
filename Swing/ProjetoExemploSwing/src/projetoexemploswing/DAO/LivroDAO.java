/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoexemploswing.DAO;

import java.util.ArrayList;
import projetoexemploswing.Banco;
import projetoexemploswing.Dominio.Livro;

/**
 * @author eltonviana
 */
public class LivroDAO implements GenericDAO<Livro> {

    @Override
    public void inserir(Livro obj) {
        Banco.BANCOLIVROS.add(obj);
    }

    @Override
    public void alterar(Livro obj) {
        // To change body of generated methods, choose Tools | Templates.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void apagar(Livro obj) {
        Banco.BANCOLIVROS.remove(obj);
    }

    @Override
    public ArrayList<Livro> buscarTodos() {
        return Banco.BANCOLIVROS;
    }

}
