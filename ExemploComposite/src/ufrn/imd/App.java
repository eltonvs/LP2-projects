package ufrn.imd;

/**
 *
 * @author elton
 */
public class App {

    public static void main(String[] args) {
        SceneGroup g1 = new SceneGroup();
        Triangle t1 = new Triangle();
        SceneGroup g2 = new SceneGroup();

        g1.add(t1);
        g1.add(g2);

        Triangle t2 = new Triangle();
        Rectangle r1 = new Rectangle();
        SceneGroup g3 = new SceneGroup();

        g2.add(t2);
        g2.add(r1);
        g2.add(g3);

        Rectangle r2 = new Rectangle();
        Rectangle r3 = new Rectangle();

        g3.add(r2);
        g3.add(r3);

        g1.draw();
    }

}
