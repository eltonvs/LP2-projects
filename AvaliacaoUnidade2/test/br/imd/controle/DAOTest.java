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
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author eltonviana
 */
public class DAOTest {

    private DAO instance = new DAO();

    /**
     * Test of inserir method, of class DAO.
     */
    @Test
    public void testInserir_Pessoa() {
        int prev = DAO.bancoPessoas.size();
        Pessoa p = null;
        try {
            p = new Pessoa("Elton", "endereço", "9999-9999", "M", 1998);
        } catch (FaltandoDadosException ex) {
            assertEquals(false, true);
        } catch (ValoresNegativosException ex) {
            assertEquals(false, true);
        }
        instance.inserir(p);
        assertEquals(prev + 1, DAO.bancoPessoas.size());
    }

    /**
     * Test of inserir method, of class DAO.
     */
    @Test
    public void testInserir_Fornecedor() {
        int prev = DAO.bancoPessoas.size();
        Fornecedor f = null;
        try {
            f = new Fornecedor(1000, 100, "Elton", "endereço", "9999-9999", "M", 1998);
        } catch (FaltandoDadosException ex) {
            assertEquals(false, true);
        } catch (ValoresNegativosException ex) {
            assertEquals(false, true);
        }
        instance.inserir(f);
        assertEquals(prev + 1, DAO.bancoPessoas.size());
    }

    /**
     * Test of inserir method, of class DAO.
     */
    @Test
    public void testInserir_Empregado() {
        int prev = DAO.bancoPessoas.size();
        Setor s = null;
        try {
            s = new Setor(0, "blablabla");
        } catch (FaltandoDadosException ex) {
            assertEquals(false, true);
        } catch (ValoresNegativosException ex) {
            assertEquals(false, true);
        }

        Empregado e = null;
        try {
            e = new Empregado(s, 1000, 10, "Alberto", "endereço", "9999-9999", "M", 1998);
        } catch (FaltandoDadosException ex) {
            assertEquals(false, true);
        } catch (ValoresNegativosException ex) {
            assertEquals(false, true);
        }
        instance.inserir(e);
        assertEquals(prev + 1, DAO.bancoPessoas.size());
    }

    /**
     * Test of inserir method, of class DAO.
     */
    @Test
    public void testInserir_Setor() {
        int prev = DAO.bancoSetores.size();
        Setor s = null;
        try {
            s = new Setor(0, "blablabla");
        } catch (FaltandoDadosException ex) {
            assertEquals(false, true);
        } catch (ValoresNegativosException ex) {
            assertEquals(false, true);
        }
        instance.inserir(s);
        assertEquals(prev + 1, DAO.bancoSetores.size());
    }

}
