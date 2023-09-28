package homework_1.ModelElements;

import java.util.ArrayList;
import java.util.List;

import homework_1.Service.Point3D;

public class Polygon {

    public Polygon(Point3D point){
        points.add(point);
    }

    public List<Point3D> points = new ArrayList<>();
}
