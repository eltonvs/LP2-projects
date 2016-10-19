/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv2revisaouni2.DAO;

import atv2revisaouni2.DB;
import atv2revisaouni2.Dominio.Carro;
import atv2revisaouni2.Dominio.Veiculo;

/**
 * @author elton
 */
public class CarroDAO implements GenericDAO<Carro> {

    @Override
    public void inserir(Carro c) {
        DB.BANCO_VEICULOS.add(c);
    }

    @Override
    public void excluir(Carro c) {
        DB.BANCO_VEICULOS.remove(c);
    }

    @Override
    public void listarTodos() {
        int i = 0;
        for (Veiculo v : DB.BANCO_VEICULOS) {
            if (v instanceof Carro) {
                System.out.println("[" + (++i) + "]: " + v.toString());
            }
        }
    }

}
