/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv2revisaouni2.Controllers;

import atv2revisaouni2.DB;
import atv2revisaouni2.Dominio.Aluguel;
import atv2revisaouni2.Dominio.Cliente;
import atv2revisaouni2.Dominio.Veiculo;
import java.time.LocalDateTime;

/**
 *
 * @author elton
 */
public class Alugar {

    public void adicionar(Cliente cliente, Veiculo veiculo, LocalDateTime dataFinal) {
        DB.BANCO_ALUGUEIS.add(new Aluguel(veiculo, cliente, LocalDateTime.now(), dataFinal));
    }

}
