/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv2revisaouni2.DAO;

import atv2revisaouni2.DB;
import atv2revisaouni2.Dominio.Moto;
import atv2revisaouni2.Dominio.Veiculo;

/**
 * @author elton
 */
public class MotoDAO implements GenericDAO<Moto> {

    @Override
    public void inserir(Moto m) {
        DB.BANCO_VEICULOS.add(m);
    }

    @Override
    public void excluir(Moto m) {
        DB.BANCO_VEICULOS.remove(m);
    }

    @Override
    public void listarTodos() {
        int i = 0;
        for (Veiculo v : DB.BANCO_VEICULOS) {
            if (v instanceof Moto) {
                System.out.println("[" + (++i) + "]: " + v.toString());
            }
        }
    }

}
