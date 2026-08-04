package lab4;

import java.util.*;

public class strassen_Alrathim {

    // Return next power of 2 >= n
    public static int nextPowerOfTwo(int n) {
        return (int) Math.pow(2, Math.ceil(Math.log(n) / Math.log(2)));
    }

    // Resize matrix to newR x newC and fill extra cells with 0
    public static int[][] resizeMatrix(int[][] mat, int newR, int newC) {
        int[][] resized = new int[newR][newC];
        for (int i = 0; i < newR; i++) {
            for (int j = 0; j < newC; j++) {
                if (i < mat.length && j < mat[0].length)
                    resized[i][j] = mat[i][j];
                else
                    resized[i][j] = 0;
            }
        }
        return resized;
    }

    // Matrix add/subtract for size x size
    public static int[][] add(int[][] A, int[][] B, int size, int sign) {
        int[][] res = new int[size][size];
        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++)
                res[i][j] = A[i][j] + sign * B[i][j];
        return res;
    }
    // Overloaded add() with default sign = +1
    public static int[][] add(int[][] A, int[][] B, int size) {
        return add(A, B, size, 1);
    }

    // Recursive Strassen multiplication (size must be power of 2)
    public static int[][] strassen(int[][] A, int[][] B) {
        int n = A.length;
        int[][] result = new int[n][n];

        if (n == 1) { // Base case
            result[0][0] = A[0][0] * B[0][0];
            return result;
        }

        int newSize = n / 2;

        // Submatrices
        int[][] a11 = new int[newSize][newSize];
        int[][] a12 = new int[newSize][newSize];
        int[][] a21 = new int[newSize][newSize];
        int[][] a22 = new int[newSize][newSize];

        int[][] b11 = new int[newSize][newSize];
        int[][] b12 = new int[newSize][newSize];
        int[][] b21 = new int[newSize][newSize];
        int[][] b22 = new int[newSize][newSize];

        // Splitting matrices
        for (int i = 0; i < newSize; i++) {
            for (int j = 0; j < newSize; j++) {
                a11[i][j] = A[i][j];
                a12[i][j] = A[i][j + newSize];
                a21[i][j] = A[i + newSize][j];
                a22[i][j] = A[i + newSize][j + newSize];

                b11[i][j] = B[i][j];
                b12[i][j] = B[i][j + newSize];
                b21[i][j] = B[i + newSize][j];
                b22[i][j] = B[i + newSize][j + newSize];
            }
        }

        // Strassen products
        int[][] m1 = strassen(add(a11, a22, newSize, 1), add(b11, b22, newSize, 1));
        int[][] m2 = strassen(add(a21, a22, newSize, 1), b11);
        int[][] m3 = strassen(a11, add(b12, b22, newSize, -1));
        int[][] m4 = strassen(a22, add(b21, b11, newSize, -1));
        int[][] m5 = strassen(add(a11, a12, newSize, 1), b22);
        int[][] m6 = strassen(add(a21, a11, newSize, -1), add(b11, b12, newSize, 1));
        int[][] m7 = strassen(add(a12, a22, newSize, -1), add(b21, b22, newSize, 1));

        // Result quadrants
        int[][] c11 = add(add(m1, m4, newSize, 1), add(m7, m5, newSize, -1), newSize);
        int[][] c12 = add(m3, m5, newSize, 1);
        int[][] c21 = add(m2, m4, newSize, 1);
        int[][] c22 = add(add(m1, m3, newSize, 1), add(m6, m2, newSize, -1), newSize);

        // Combine into final matrix
        for (int i = 0; i < newSize; i++)
            for (int j = 0; j < newSize; j++) {
                result[i][j] = c11[i][j];
                result[i][j + newSize] = c12[i][j];
                result[i + newSize][j] = c21[i][j];
                result[i + newSize][j + newSize] = c22[i][j];
            }

        return result;
    }

    // Multiply mat1(n×m) and mat2(m×q)
    public static int[][] multiply(int[][] A, int[][] B) {
        int n = A.length, m = A[0].length, q = B[0].length;

        int size = nextPowerOfTwo(Math.max(Math.max(n, m), q));

        int[][] aPad = resizeMatrix(A, size, size);
        int[][] bPad = resizeMatrix(B, size, size);

        int[][] cPad = strassen(aPad, bPad);

        // Extract n x q result
        int[][] result = new int[n][q];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < q; j++)
                result[i][j] = cPad[i][j];

        return result;
    }

    // Driver Code,
    public static void main(String[] args) {

        int[][] mat1 = { {1, 2}, {3,4} };
        int[][] mat2 = { {5,6}, {7, 8} };

        int[][] res = multiply(mat1, mat2);

        System.out.println("Result:");
        for (int[] row : res) {
            System.out.println(Arrays.toString(row));
        }
    }
}
