/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoexemploswing;

import java.util.ArrayList;
import projetoexemploswing.DAO.LivroDAO;
import projetoexemploswing.Dominio.Autor;
import projetoexemploswing.Dominio.Livro;

/**
 * @author eltonviana
 */
public class ProjetoExemploSwing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Livro l1 = new Livro("Java", "321684321", new Autor("Juquinha", "123"));
        Livro l2 = new Livro("C++", "684652131", new Autor("Selan", "456"));

        LivroDAO ld = new LivroDAO();
        ld.inserir(l1);
        ld.inserir(l2);

        ArrayList<Livro> livros = ld.buscarTodos();

        for (Livro l : livros) {
            System.out.println("Livro: " + l.getTitulo());
        }
    }

}
