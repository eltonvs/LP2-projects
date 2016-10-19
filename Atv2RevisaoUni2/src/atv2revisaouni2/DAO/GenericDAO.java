/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv2revisaouni2.DAO;

/**
 * @author elton
 * @param <C>
 */
public interface GenericDAO<C> {
    public void inserir(C e);
    public void excluir(C e);
    public void listarTodos();
}
