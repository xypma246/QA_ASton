package org.example;

public class Main {
    public static void main(String[] args) {
        String[][] invalidDataMatrix = {
                {"24", "4", "12", "6"},
                {"7", "10", "miss", "4"},
                {"16", "1", "4", "3"},
                {"7", "6", "15", "4"}
        };

        String[][] invalidSizeMatrix = {
                {"5", "5", "5", "5", "5"},
                {"5", "5", "5", "5", "5"},
                {"5", "5", "5", "5", "5"},
                {"5", "5", "5", "5", "5"},
                {"5", "5", "5", "5", "5"}
        };

        String[][] validMatrix = new String[4][4];
        for (int i = 0; i < validMatrix.length; i++) {
            for (int j = 0; j < validMatrix.length; j++) {
                validMatrix[i][j] = "2";
            }
        }
        try {
            stringToIntAndCalculate(validMatrix);
            /*
            Чтобы вызвать MyArrayDataException нужно поменять местами две
            нижние строчки
             */
            stringToIntAndCalculate(invalidSizeMatrix);
            stringToIntAndCalculate(invalidDataMatrix);
        } catch (MyArraySizeException e) {
            throw new MyArraySizeException(e.getMessage());
        } catch (MyArrayDataException e) {
            throw new MyArrayDataException(e.getMessage());
        }
    }

    private static void stringToIntAndCalculate(String[][] matrix) throws MyArraySizeException, MyArrayDataException {
        checkSizeArray(matrix);

        int sumOfMatrix = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                try {
                    sumOfMatrix += Integer.parseInt(matrix[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Некорректные данные в ячейке: " + "[" + i + ", " + j + "]");
                }
            }
        }
        System.out.println(sumOfMatrix);
    }

    private static void checkSizeArray(String[][] array) throws MyArraySizeException {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                counter++;
            }
        }
        if (counter != 16) {
            throw new MyArraySizeException("Неверный размер матрицы! Нужна 4х4!");
        }
    }
}