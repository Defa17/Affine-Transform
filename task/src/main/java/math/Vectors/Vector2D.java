package math.Vectors;

public class Vector2D extends NDimensionalVector  {

    final private  double a;
    final private double b;

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public Vector2D(double a, double b) {
        super(a, b);
        this.a = a;
        this.b = b;
    }
    public static Vector2D addition(Vector2D a, Vector2D b){
        return new Vector2D(a.getA() + b.getA(), a.getB() + b.getB());
    }

    public static Vector2D subtraction(Vector2D a, Vector2D b){
        return new Vector2D(a.getA() - b.getA(), a.getB() - b.getB());
    }

    @Override
    public double[] getArrValues() {
        return new double[]{a,b};
    }
    public static Vector2D scale(double a, Vector2D vector) {
        return  new Vector2D(vector.getA() * a, vector.getB() * a);
    }
    @Override
    public double length() {
        return this.length;
    }

    @Override
    public Vector2D normalization() {
        return new Vector2D(this.a / length, this.b / length);
    }
    public static double scalarProduct(Vector2D vector1, Vector2D vector2){
        return vector1.length * vector2.length * vector1.cosAngleBetweenVectors(vector2);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vector2D vector = (Vector2D) o;
        return Double.compare(vector.a, a) == 0 && Double.compare(vector.b, b) == 0;
    }
}
