package homework_1.ModelElements;

import java.util.ArrayList;
import java.util.List;

public class PolygonalModel {
    public List<Polygon> polygons;
    public List<Texture> textures;

    public PolygonalModel(List<Texture> textures) {
        this.polygons = new ArrayList<>();
        this.textures = textures;
    }
}
