package br.imd.ufrn.shape;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Shape {

    private Color color;

    public abstract void draw(Graphics g);

    public void defineColor(int r, int g, int b) {
        this.color = new Color(r, g, b);
    }

    public Color getColor() {
        return color;
    }

}
