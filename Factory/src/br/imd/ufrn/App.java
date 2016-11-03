package br.imd.ufrn;

import br.imd.ufrn.gui.Window;
import br.imd.ufrn.shape.Shape;
import br.imd.ufrn.shape.ShapeFactory;

// Window that draws a generic shape
public class App {

    public static void main(String[] args) {
        Window w = new Window("Shapes", 300, 300);

        w.show();

        Shape shape = ShapeFactory.newShape(0);
        w.drawShape(shape);
    }

}
