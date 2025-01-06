package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        int value = 77;
        String text = "Привет!";
        int[] array = {0, 1, 0, 0, 1};
        int[] arrayToFill = new int[100];
        int[] arrayToMultiply = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[][] doubleMatrix = new int[5][5];

        printThreeWords();
        System.out.println(checkSumSign(a, b));
        System.out.println(printColor(value));
        System.out.println(compareNumbers(a, b));
        System.out.println(checkSumReturnBoolean(a, b));
        System.out.println(positiveOrNegativeNumber(value));
        System.out.println(isNegative(value));
        printSeveralTimes(text, a);
        System.out.println(isLeap(2000));
        System.out.println(Arrays.toString(changeArray(array)));
        System.out.println(Arrays.toString(toFillArray(arrayToFill)));
        System.out.println(Arrays.toString(multiplyingArray(arrayToMultiply)));
        System.out.println(Arrays.deepToString(fillMatrix(doubleMatrix)));
        System.out.println(Arrays.toString(createArray(b, value)));
    }

    private static void printThreeWords() {
        System.out.println("Orange \nBanana \nApple");
    }

    private static String checkSumSign(int a, int b) {
        int c = a + b;
        if (c >= 0) {
            return "Сумма положительная";
        } else {
            return "Сумма отрицательная";
        }
    }

    private static String printColor(int value) {
        if (value <= 0) {
            return "Красный";
        } else if (value <= 100) {
            return "Жёлтый";
        } else {
            return "Зелёный";
        }
    }

    private static String compareNumbers(int a, int b) {
        int temp = Integer.compare(a, b);
        if (temp == -1) {
            return "a < b";
        } else {
            return "a >= b";
        }
    }

    private static boolean checkSumReturnBoolean(int firstInt, int secondInt) {
        int temp = firstInt + secondInt;
        return temp >= 10 && temp <= 20;
    }

    private static String positiveOrNegativeNumber(int number) {
        if (number >= 0) {
            return "Положительное";
        } else {
            return "Отрицательное";
        }
    }

    private static boolean isNegative(int number) {
        return number < 0;
    }

    private static void printSeveralTimes(String text, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(text);
        }
    }

    private static boolean isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    private static int[] changeArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }
        return array;
    }

    private static int[] toFillArray(int[] arrayToFill) {
        for (int i = 0; i < arrayToFill.length; i++) {
            arrayToFill[i] = i + 1;
        }
        return arrayToFill;
    }

    private static int[] multiplyingArray(int[] arrayToMultiply) {
        for (int i = 0; i < arrayToMultiply.length; i++) {
            if (arrayToMultiply[i] < 6) {
                arrayToMultiply[i] = arrayToMultiply[i] * 2;
            }
        }
        return arrayToMultiply;
    }

    private static int[][] fillMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    matrix[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = matrix[i].length - 1; j >= 0; j--) {
                matrix[i][matrix[j].length - 1 - i] = 1;
            }
        }
        return matrix;
    }

    private static int[] createArray(int len, int initialValue) {
        int[] result = new int[len];
        for (int i = 0; i < result.length; i++) {
            result[i] = initialValue;
        }
        return result;
    }
}

