package math.AffineTransform;
import math.Matrix.Matrix4D1;
public class AffineTransformation {
    private Matrix4D1 transformationMatrix;

    public AffineTransformation(Matrix4D1 transformationMatrix) {
        this.transformationMatrix = transformationMatrix;
    }
    public AffineTransformation() {

        this.transformationMatrix = new Matrix4D1(true);
    }

    public Matrix4D1 getTransformationMatrix() {

        return transformationMatrix;
    }

    /**
     * Метод для масштабирования матрицы.
     * @params
     * sX, sY, sZ, - значения для изменения масштаба по каждой координате
     * **/
    public void scale(float sX, float sY, float sZ) {
        Matrix4D1 scaleMatrix = new Matrix4D1(new float[][]{
                {sX, 0, 0, 0},
                {0, sY, 0, 0},
                {0, 0, sZ, 0},
                {0, 0, 0, 1}
        });
        transformationMatrix = transformationMatrix.multiply(scaleMatrix);
    }
    /**
     * Метод для универсального поворота матрицы вокруг осей.
     * @params
     * rX, rY, rZ - значения (в радианах) для поворота по каждой координате
     * **/

    public void rotate(float rX, float rY, float rZ) {
        float cosX = (float) Math.cos(rX);
        float sinX = (float) Math.sin(rX);
        float cosY = (float) Math.cos(rY);
        float sinY = (float) Math.sin(rY);
        float cosZ = (float) Math.cos(rZ);
        float sinZ = (float) Math.sin(rZ);

        Matrix4D1 rotationMatrix = new Matrix4D1(new float[][]{
                {cosY * cosZ, -cosX * sinZ + sinX * sinY * cosZ, sinX * sinZ + cosX * sinY * cosZ, 0},
                {cosY * sinZ, cosX * cosZ + sinX * sinY * sinZ, -sinX * cosZ + cosX * sinY * sinZ, 0},
                {-sinY, sinX * cosY, cosX * cosY, 0},
                {0, 0, 0, 1}
        });

        transformationMatrix = transformationMatrix.multiply(rotationMatrix);
    }

    /**
     * Метод для параллельного переноса.
     * @params
     * tX, tY, tz - значения смещения по координатам
     * **/
    public void translate(float tX, float tY, float tZ) {
        Matrix4D1 translationMatrix = new Matrix4D1(new float[][]{
                {1, 0, 0, tX},
                {0, 1, 0, tY},
                {0, 0, 1, tZ},
                {0, 0, 0, 1}
        });

        transformationMatrix = transformationMatrix.multiply(translationMatrix);
    }

    @Override
    public String toString() {
        return "AffineTransformation{" +
                "transformationMatrix=" + transformationMatrix +
                '}';
    }
}
