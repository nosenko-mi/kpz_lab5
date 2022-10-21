package com.example;

import java.util.Arrays;

public class Main {
    private static final String INPUT_TXT = "input.txt";
    public static final String OUTPUT_TXT = "output.txt";

    public static void main(String[] args) {
        Matrix matrix = FileController.loadMatrix(INPUT_TXT);
        if (matrix == null) {
            FileController.saveString(OUTPUT_TXT, "Error occurred while reading file");
            return;
        }
        int[] size = matrix.getSize();
        double geometricMean = matrix.getGeometricMean();
        System.out.println(Arrays.toString(size));
        System.out.println(matrix);
        FileController.saveResult(OUTPUT_TXT, size[0], size[1], geometricMean);
    }
}
