package math.AffineTransform;

import math.Matrix.Matrix4D1;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;


public class TestAT {
    @Test
    public void testSimpleScaleAffineTransform1() {

        AffineTransformation affineTransformation = new AffineTransformation();

        Matrix4D1 matrix4D11 = new Matrix4D1(new float[][]{{1, 0, 0, 0},
                                                           {0, 1, 0, 0},
                                                           {0, 0, 1, 0},
                                                           {0, 0, 0, 1}});
        affineTransformation.scale(1.0f, 1.0f, 1.0f);
        Assertions.assertEquals(affineTransformation.getTransformationMatrix(), matrix4D11);
    }

    @Test
    public void testSimpleScaleAffineTransform2() {
        Matrix4D1 matrix4D11 = new Matrix4D1(new float[][]{{5, 0, 0, 0},
                {0, 5, 0, 0},
                {0, 0, 5, 0},
                {0, 0, 0, 1}});
        Matrix4D1 matrix4D1 = new Matrix4D1(new float[][]{{1, 0, 0, 0},
                                                           {0, 1, 0, 0},
                                                           {0, 0, 1, 0},
                                                           {0, 0, 0, 1}});

        AffineTransformation affineTransformation = new AffineTransformation(matrix4D1);

        affineTransformation.scale(5.0f, 5.0f, 5.0f);
        Assertions.assertEquals(affineTransformation.getTransformationMatrix(), matrix4D11);
    }
    @Test
    public void testSimpleScaleAffineTransform3() {

        Matrix4D1 matrix4D11 = new Matrix4D1(new float[][]{{-25, 0, 0, 0},
                                                           {0, -13, 0, 0},
                                                           {0, 0, -10, 0},
                                                           {0, 0, 0, 1}});
        Matrix4D1 matrix4D1 = new Matrix4D1(new float[][]{{25, 0, 0, 0},
                                                          {0, 13, 0, 0},
                                                          {0, 0, 10, 0},
                                                          {0, 0, 0, 1}});
        AffineTransformation affineTransformation = new AffineTransformation(matrix4D1);
        affineTransformation.scale(-1.0f, -1.0f, -1.0f);
        Assertions.assertEquals(affineTransformation.getTransformationMatrix(), matrix4D11);
    }

    @Test
    public void testSimpleRotateAffineTransform1() {
        Matrix4D1 matrix4D11 = new Matrix4D1(new float[][]{{1, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 1, 0},
                {0, 0, 0, 1}});
        Matrix4D1 matrix4D1 = new Matrix4D1(new float[][]{{0.29192656f, -0.07207501f, 0.9537211f, 0.0f},
                                                          {0.45464867f, 0.88774973f, -0.07207501f, 0.0f},
                                                          {-0.84147096f, 0.45464867f, 0.29192656f, 0.0f},
                                                          {0.0f, 0.0f, 0.0f, 1.0f}});

        AffineTransformation affineTransformation = new AffineTransformation(matrix4D11);

        affineTransformation.rotate(1.0f, 1.0f, 1.0f);
        Assertions.assertEquals(affineTransformation.getTransformationMatrix(), matrix4D1);
    }

    @Test
    public void testSimpleRotateAffineTransform2() {
        Matrix4D1 matrix4D11 = new Matrix4D1(new float[][]{{1, 0, 0, 0},
                                                           {0, 1, 0, 0},
                                                           {0, 0, 1, 0},
                                                           {0, 0, 0, 1}});
        Matrix4D1 matrix4D1 = new Matrix4D1(new float[][]{{-1.0f, -8.742278E-8f, 7.642742E-15f, 0.0f},
                                                          {-8.742278E-8f, 1.0f, -8.742278E-8f, 0.0f},
                                                          {0.0f, -8.742278E-8f, -1.0f, 0.0f},
                                                          {0.0f, 0.0f, 0.0f, 1.0f}});

        AffineTransformation affineTransformation = new AffineTransformation(matrix4D11);

        affineTransformation.rotate((float) Math.PI, (float) 0, (float) Math.PI);
        Assertions.assertEquals(affineTransformation.getTransformationMatrix(), matrix4D1);
    }

    @Test
    public void testSimpleRotateAffineTransform3() {
        Matrix4D1 matrix4D11 = new Matrix4D1(new float[][]{{1, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 1, 0},
                {0, 0, 0, 1}});
        Matrix4D1 matrix4D1 = new Matrix4D1(new float[][]{{1.0f, 0.0f, 0.0f, 0.0f},
                                                         {0.0f, 1.0f, 0.0f, 0.0f},
                                                         {0.0f, 0.0f, 1.0f, 0.0f},
                                                         {0.0f, 0.0f, 0.0f, 1.0f}});

        AffineTransformation affineTransformation = new AffineTransformation(matrix4D11);

        affineTransformation.rotate(0, 0, 0);

        Assertions.assertEquals(affineTransformation.getTransformationMatrix(), matrix4D1);
    }

    @Test
    public void testSimpleTranslateAffineTransform1() {
        Matrix4D1 matrix4D11 = new Matrix4D1(new float[][]{{1, 0, 0, 0},
                                                           {0, 1, 0, 0},
                                                           {0, 0, 1, 0},
                                                           {0, 0, 0, 1}});
        Matrix4D1 matrix4D1 = new Matrix4D1(new float[][]{{1, 0, 0, 2},
                                                          {0, 1, 0, 2},
                                                          {0, 0, 1, 2},
                                                          {0, 0, 0, 1}});

        AffineTransformation affineTransformation = new AffineTransformation(matrix4D11);

        affineTransformation.translate(2.0f, 2.0f, 2.0f);

        Assertions.assertEquals(affineTransformation.getTransformationMatrix(), matrix4D1);
    }

    @Test
    public void testSimpleTranslateAffineTransform2() {
        Matrix4D1 matrix4D11 = new Matrix4D1(new float[][]{{-3, 0, 0, 0},
                                                           {0, -6, 0, 0},
                                                           {0, 0, 1, 0},
                                                           {0, 0, 0, 1}});
        Matrix4D1 matrix4D1 = new Matrix4D1(new float[][]{{-3.0f, 0.0f, 0.0f, -15.0f},
                                                          {0.0f, -6.0f, 0.0f, -6.0f},
                                                          {0.0f, 0.0f, 1.0f, -2.0f},
                                                          {0.0f, 0.0f, 0.0f, 1.0f}});

        AffineTransformation affineTransformation = new AffineTransformation(matrix4D11);

        affineTransformation.translate(5.0f, 1.0f, -2.0f);

        Assertions.assertEquals(affineTransformation.getTransformationMatrix(), matrix4D1);
    }
    @Test
    public void testSimpleTranslateAffineTransform3() {
        Matrix4D1 matrix4D11 = new Matrix4D1(new float[][]{{1, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 1, 0},
                {0, 0, 0, 1}});
        Matrix4D1 matrix4D1 = new Matrix4D1(new float[][]{{1, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 1, 0},
                {0, 0, 0, 1}});

        AffineTransformation affineTransformation = new AffineTransformation(matrix4D11);

        affineTransformation.translate(0.0f, 0.0f, 0.0f);

        Assertions.assertEquals(affineTransformation.getTransformationMatrix(), matrix4D1);
    }



}


