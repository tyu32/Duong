package Homework;

import java.util.Random;

public class DiagonalDifference {
    public static int[][] generateAndPrintArray(int n) {
        Random random = new Random();
        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // 生成一个小于20的随机整数
                array[i][j] = random.nextInt(41) - 20;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        return array;
    }

    public static int diagonalDifference(int n, int[][] arr) {
        int leftSum = 0;
        int rightSum = 0;
        for(int i = 0; i < n; ++i) {
            leftSum += arr[i][i];
            rightSum += arr[n - 1 - i][i];
            //System.out.println(i + " " + leftSum + " " + rightSum);
        }
        return Math.abs(leftSum - rightSum);
    }

    public static void main(String[] args) {
        int size = 3;
        int[][] arr =  generateAndPrintArray(size);
        int result = diagonalDifference(size, arr);
        System.out.println(result);
    }
}
