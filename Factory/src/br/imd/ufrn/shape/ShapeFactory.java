/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.imd.ufrn.shape;

/**
 *
 * @author elton
 */
public class ShapeFactory {

    public static Shape newShape() {
        return new Circle();
    }

    public static Shape newShape(int i) {
        return i == 1 ? new Circle() : i == 2 ? new Square() : null;
    }

}
