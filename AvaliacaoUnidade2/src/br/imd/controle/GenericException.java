/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.imd.controle;

/**
 *
 * @author eltonviana
 */
public class GenericException extends Exception {

    public GenericException() {
    }

    public GenericException(String message) {
        super("GenericException: " + message);
    }

    @Override
    public String getMessage() {
        return super.getMessage(); //To change body of generated methods, choose Tools | Templates.
    }

}
