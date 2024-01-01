package math.Matrix;

import java.util.ArrayList;
import java.util.Arrays;

public class Matrix4D1 {
    private float[][] matrix = new float[4][4];

    public Matrix4D1(float[][] matrix) {
        this.matrix = new float[4][4];
        for (int i = 0; i < 4; i++)
            System.arraycopy(matrix[i], 0, this.matrix[i], 0, 4);
    }

    public Matrix4D1() {
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++)
                matrix[i][j] = 0;
    }

    public Matrix4D1(boolean isIdentity) {
        this();
        if (isIdentity) {
            for (int i = 0; i < 4; i++)
                matrix[i][i] = 1;
        }
    }

    public Matrix4D1 multiply(Matrix4D1 other) {
        Matrix4D1 result = new Matrix4D1();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    result.matrix[i][j] += this.matrix[i][k] * other.matrix[k][j];
                }
            }
        }
        return result;
    }

    public ArrayList<String> toStringa() {
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++){
            arrayList.add(i, Arrays.toString(matrix[i]));
        }
        return arrayList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Matrix4D1 matrix4D1)) return false;
        return Arrays.deepEquals(matrix, matrix4D1.matrix);
    }

    @Override
    public int hashCode() {
        return Arrays.deepHashCode(matrix);
    }
}
