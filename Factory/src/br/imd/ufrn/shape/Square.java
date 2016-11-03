/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.imd.ufrn.shape;

import java.awt.Graphics;

/**
 *
 * @author elton
 */
public class Square extends Shape {

    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        g.fillRect(0, 0, 100, 100);
    }

}
