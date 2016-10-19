/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv2revisaouni2.Dominio;

/**
 *
 * @author elton
 */
public class Cliente {

    private String nome;
    private String carteiraMotorista;

    public Cliente() {
    }

    public Cliente(String nome, String carteiraMotorista) {
        this.nome = nome;
        this.carteiraMotorista = carteiraMotorista;
    }

    public String getNome() {
        return nome;
    }

    public String getCarteiraMotorista() {
        return carteiraMotorista;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCarteiraMotorista(String carteiraMotorista) {
        this.carteiraMotorista = carteiraMotorista;
    }

}
