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
public class Carro extends Veiculo {

    private int potenciaMotor;
    private int numPortas;

    public Carro() {
    }

    public Carro(int potenciaMotor, int numPortas, String marca, String modelo) {
        super(marca, modelo);
        this.potenciaMotor = potenciaMotor;
        this.numPortas = numPortas;
    }

    public int getPotenciaMotor() {
        return potenciaMotor;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setPotenciaMotor(int potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

}
