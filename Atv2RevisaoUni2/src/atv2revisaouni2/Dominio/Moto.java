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
public class Moto extends Veiculo {

    private boolean partidaManual;
    private int cilindradas;

    public Moto() {
    }

    public Moto(boolean partidaManual, int cilindradas, String marca, String modelo) {
        super(marca, modelo);
        this.partidaManual = partidaManual;
        this.cilindradas = cilindradas;
    }

    public boolean isPartidaManual() {
        return partidaManual;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setPartidaManual(boolean partidaManual) {
        this.partidaManual = partidaManual;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

}
