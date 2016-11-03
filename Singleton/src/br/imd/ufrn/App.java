/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.imd.ufrn;

/**
 *
 * @author elton
 */
public class App {

    public static void main(String[] args) {
        SecurityManager sm1 = SecurityManager.getInstance();
        sm1.login();

        SecurityManager sm2 = SecurityManager.getInstance();
        sm2.login();
    }

}
