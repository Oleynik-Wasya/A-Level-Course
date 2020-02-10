package com.alevel.java.nix.hometasks.task3;

import java.time.DayOfWeek;

public class HomeTask3 {
    public static void main(String[] args) {
        Transposition transposition = new Transposition();
        int[][] matrix = {{0, 1, 2},
                {3, 4, 5},
                {6, 7, 8}};

        System.out.println("Source matrix: ");
        printMatrix(matrix);
        transposition.transpose(matrix);
        System.out.println("Transposed matrix: ");
        printMatrix(matrix);

        double[] test = {111.1, 998.3, 343.5, 0.8, 99.99, 9.8, 2000.0};
        var teslaBuyer = new TeslaBuyer();
        DayOfWeek[] result = teslaBuyer.profit(test);
        System.out.println("Day of Buy: " + result[0] + "\n" +
                "Day of Sale: " + result[1]);
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0, row = matrix.length; i < row; i++) {
            for (int j = 0, col = matrix[0].length; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
