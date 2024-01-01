package math.Matrix;


import math.Vectors.Vector;
import math.Vectors.Vector3D;

public class Matrix3D extends NDimensionalMatrix {




    final private Vector3D vector1;
    final private Vector3D vector2;
    final private Vector3D vector3;

    public Matrix3D(Vector3D vector1,
                    Vector3D vector2,
                    Vector3D vector3) {
        super(vector1,vector2,vector3);
        if(vector1.getDimensional() != 3 ){
            throw new ArithmeticException("Неправильная размерность векторов");
        }
        this.vector1 = vector1;
        this.vector2 = vector2;
        this.vector3 = vector3;
        dimensional = 3;
    }

    public Matrix3D() {
        dimensional = 3;
        this.vector1 = new Vector3D(1, 0, 0);
        this.vector2 = new Vector3D(0, 1, 0);
        this.vector3 = new Vector3D(0, 0, 1);
        matrixInVectors = new Vector3D[]{
                vector1,
                vector2,
                vector3
        };
    }
    @Override
    public int getDimensional() {

        return dimensional;
    }
    @Override
    public Vector[] getMatrixInVectors() {

        return matrixInVectors;
    }

    public Vector3D getVector1() {

        return vector1;
    }

    public Vector3D getVector2() {

        return vector2;
    }

    public Vector3D getVector3() {

        return vector3;
    }

}
