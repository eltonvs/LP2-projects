package ufrn.imd;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author elton
 */
public class SceneGroup implements SceneObject {

    private List<SceneObject> children = new ArrayList<>();

    public void add(SceneObject obj) {
        children.add(obj);
    }

    public void remove(SceneObject obj) {
        children.remove(obj);
    }

    @Override
    public void draw() {
        for (SceneObject so : children) {
            so.draw();
        }
    }

}
