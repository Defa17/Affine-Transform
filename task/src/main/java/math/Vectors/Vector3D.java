package math.Vectors;

public class Vector3D extends NDimensionalVector{

    final private double a;
    final private double b;
    final private double c;


    public Vector3D(double a, double b, double c) {
        super(a,b,c);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public static Vector3D addition(Vector3D vector1, Vector3D vector2) {
        return new Vector3D(
                vector1.a + vector2.a,
                vector1.b + vector2.b,
                vector1.c + vector2.c
        );
    }
    public static Vector3D subtraction(Vector3D vector1, Vector3D vector2) {
        return new Vector3D(
                vector1.a - vector2.a,
                vector1.b - vector2.b,
                vector1.c - vector2.c
        );
    }
    @Override
    public double length() {
        return length;
    }

    @Override
    public Vector3D normalization() {
        return new Vector3D(this.a / length, this.b / length, this.c / length);
    }
    @Override
    public double[] getArrValues() {
        return new double[]{a, b, c};
    }

    public Vector3D vectorProduct(Vector3D vector) {
        double i = b * vector.getC() - c * vector.getB();
        double j = a * vector.getC() - c * vector.getA();
        double k = b * vector.getA() - a * vector.getB();
        return new Vector3D(i, -j, k);
    }

}
