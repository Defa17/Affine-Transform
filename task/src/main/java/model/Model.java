package model;

import math.Vectors.Vector2D;
import math.Vectors.Vector3D;

import java.util.ArrayList;

public class Model {

    public ArrayList<Vector3D> vertices = new ArrayList<Vector3D>();
    public ArrayList<Vector2D> textureVertices = new ArrayList<Vector2D>();
    public ArrayList<Vector3D> normals = new ArrayList<Vector3D>();
    public ArrayList<Polygon> polygons = new ArrayList<Polygon>();
}
