package homework_1.ModelElements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Scene {
    public Integer id;
    public List<PolygonalModel> models;
    public List<Flash> flashes;
    public List<Camera> cameras = new ArrayList<Camera>();

    public Scene(Integer id, List<PolygonalModel> models, List<Flash> flashes, List<Camera> cameras) throws IOException {

        this.id = id;

        if (models.isEmpty()) {
            throw new IOException("Должна быть одна модель");
        } else {
            this.models = models;
        }

        this.flashes = flashes;

        if (cameras.isEmpty()) {
            throw new IOException("Должна быть одна камера");
        } else {
            this.cameras = cameras;
        }
    }

    public <Type> Type method1(Type flach){
        return flach;
    }

    public <Type1, Type2> Type1 method2(Type1 model, Type2 flach){
        return model;
    }
}
