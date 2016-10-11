/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoexemploswing.DAO;

import java.util.ArrayList;

/**
 * @author eltonviana
 * @param <C>
 */
public interface GenericDAO<C> {

    public void inserir(C obj);

    public void alterar(C obj);

    public void apagar(C obj);

    public ArrayList<C> buscarTodos();
}
