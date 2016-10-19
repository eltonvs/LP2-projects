/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv2revisaouni2.Dominio;

import java.time.LocalDateTime;

/**
 * @author elton
 */
public class Aluguel {

    private final Veiculo veiculo;
    private final Cliente cliente;
    private final LocalDateTime dataInicio;
    private LocalDateTime dataFinal;

    public Aluguel(Veiculo veiculo, Cliente cliente, LocalDateTime dataInicio, LocalDateTime dataFinal) {
        this.veiculo = veiculo;
        this.cliente = cliente;
        this.dataInicio = dataInicio;
        this.dataFinal = dataFinal;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public LocalDateTime getDataInicio() {
        return dataInicio;
    }

    public LocalDateTime getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(LocalDateTime dataFinal) {
        this.dataFinal = dataFinal;
    }

}
