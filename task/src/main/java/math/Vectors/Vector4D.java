package math.Vectors;

public class Vector4D extends NDimensionalVector{
    final private double a;
    final private double b;
    final private double c;
    final private double d;
    public Vector4D(double a, double b, double c, double d){
        super(a,b,c,d);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
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

    public double getD() {
        return d;
    }

    public static Vector4D subtraction(Vector4D vector1, Vector4D vector2){
        return new Vector4D(
                vector1.a - vector2.a,
                vector1.b - vector2.b,
                vector1.c - vector2.c,
                vector1.d - vector2.d
        );
    }
    public static Vector4D addition(Vector4D vector1, Vector4D vector2){
        return new Vector4D(
                vector1.a + vector2.a,
                vector1.b + vector2.b,
                vector1.c + vector2.c,
                vector1.d + vector2.d
        );
    }
    @Override
    public Vector4D scale(double a) {
        return new Vector4D(
                this.a * a,
                this.b * a,
                this.c * a,
                this.d * a
        );
    }

    @Override
    public double length() {
        return length;
    }

    @Override
    public Vector4D normalization() {
        return new Vector4D(this.a / length, this.b / length, this.c / length, this.d / length);
    }
    @Override
    public double[] getArrValues() {
        return new double[]{a,b,c,d};
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
       Vector4D that = (Vector4D) o;
        return Double.compare(that.a, a) == 0 && Double.compare(that.b, b) == 0 && Double.compare(that.c, c) == 0 && Double.compare(that.d, d) == 0;
    }
}
