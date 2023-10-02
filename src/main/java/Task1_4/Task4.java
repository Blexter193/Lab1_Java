package Task1_4;

public class Task4 {
    public static void main(String[] args) {
        int[][] matrixA = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] matrixB = {
                {7, 8},
                {9, 10},
                {11, 12}
        };

        int[][] result = multiplyMatrices(matrixA, matrixB);

        // Виведення результату на консоль
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] multiplyMatrices(final int[][] A, final int[][] B) {
        int rowsA = A.length;
        int colsA = A[0].length;
        int rowsB = B.length;
        int colsB = B[0].length;

        // Перевірка чи можна помножити матриці
        if (colsA != rowsB) {
            throw new IllegalArgumentException("Неможливо виконати множення матриць: розмірності не відповідають.");
        }

        // Створення результату матриці
        int[][] result = new int[rowsA][colsB];

        // Виконання множення
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                int sum = 0;
                for (int k = 0; k < colsA; k++) {
                    sum += A[i][k] * B[k][j];
                }
                result[i][j] = sum;
            }
        }

        return result;
    }
}

