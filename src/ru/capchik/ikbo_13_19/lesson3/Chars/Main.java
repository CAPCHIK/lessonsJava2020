package ru.capchik.ikbo_13_19.lesson3.Chars;

import java.io.Console;
import java.util.Arrays;
import java.util.Random;

public class Main {
    static Random random = new Random(5);
    public static void main(String[] args) throws InterruptedException {
        char[][] matrix = new char[5][30];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = '.';
            }
        }
        while (true){
            System.out.println(print(matrix));
            proceed(matrix);
            Thread.sleep(500);
        }
    }

    private static void proceed(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.arraycopy(matrix[i], 1, matrix[i], 0, matrix[i].length-1);
            matrix[i][matrix[i].length - 1] = '.';
            if (random.nextInt(300) < 10) {
                matrix[i][matrix[i].length - 1] = (char)(random.nextInt((int)'Z') + (int)'A');
            }
        }
    }
    static int i;
    static String print(char[][] matrix) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
               sb.append(String.format("%c", matrix[i][j]));
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}
