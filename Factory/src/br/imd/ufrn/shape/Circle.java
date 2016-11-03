package br.imd.ufrn.shape;

import java.awt.Graphics;

public class Circle extends Shape {

    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        g.fillOval(0, 0, 50, 50);
    }

}
