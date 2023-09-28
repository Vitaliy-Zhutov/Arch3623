package homework_1.InMemoryModel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import homework_1.ModelElements.Camera;
import homework_1.ModelElements.Flash;
import homework_1.ModelElements.PolygonalModel;
import homework_1.ModelElements.Scene;
import homework_1.ModelElements.Texture;

public class ModelStore implements IModelChanger {
    
    public ModelStore(IModelChangedObserver[] changeObservers) throws IOException {
        this.changeObservers = changeObservers;

        this.models = new ArrayList<>();
        this.scenes = new ArrayList<>();
        this.flashes = new ArrayList<>();
        this.cameras = new ArrayList<>();

        models.add(new PolygonalModel(new ArrayList<Texture>()));
        scenes.add(new Scene(1, models, flashes, cameras));
        flashes.add(new Flash());
        cameras.add(new Camera());
    }

    public List<PolygonalModel> models;
    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;
    private IModelChangedObserver[] changeObservers;


    // Регистрирует изменения модели
    @Override
    public void notifyChange(IModelChanger sender) {
    }

    // Возвращает сцену по id
    public Scene getScene(Integer id) {
        for (int i = 0; i < scenes.size(); i++) {
            if (scenes.get(i).id == id) {
                return scenes.get(i);
            }
        }
        return null;
    }
}
