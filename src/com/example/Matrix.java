package com.example;

import java.util.Arrays;

public class Matrix {
    private Double[][] matrix;

    public Matrix(){}

    public Matrix(Double[][] matrix) {
        this.matrix = matrix;
    }

    public double getGeometricMean(){
        double root = 0;
        double result = -1;
        double product = 1;
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                if (matrix[i][j] > 0){
                    product *= matrix[i][j];
                    root++;
                }
            }
        }
        if (root > 1){
            result = Math.pow(product, 1/root);
        }
        return result;
    }

    public int[] getSize(){
        return new int[]{matrix.length, matrix[0].length};
    }

    @Override
    public String toString() {
        return Arrays.deepToString(matrix).replace("], ", "]\n");
    }
}
