/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoexemploswing.DAO;

import java.util.ArrayList;
import projetoexemploswing.Banco;
import projetoexemploswing.Dominio.Autor;

/**
 * @author eltonviana
 */
public class AutorDAO implements GenericDAO<Autor> {

    @Override
    public void inserir(Autor obj) {
        Banco.BANCOAUTOR.add(obj);
    }

    @Override
    public void alterar(Autor obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void apagar(Autor obj) {
        Banco.BANCOAUTOR.remove(obj);
    }

    @Override
    public ArrayList<Autor> buscarTodos() {
        return Banco.BANCOAUTOR;
    }

}
