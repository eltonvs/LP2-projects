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
public class SecurityManager {

    private static SecurityManager instance;

    private SecurityManager() {
    }

    public static SecurityManager getInstance() {
        if (instance == null) {
            synchronized (SecurityManager.class) {
                if (instance == null) {
                    instance = new SecurityManager();
                }
            }
        }
        return instance;
    }

    public boolean login() {
        return true;
    }

}
