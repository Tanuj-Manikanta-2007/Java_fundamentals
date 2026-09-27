package Dsa_Java.src.Arrays.Hard;
import java.util.*;
public class spiral_printing {
    static void printSpiral(int[][] matrix){
        List<Integer> list = new ArrayList<>();
        int n = matrix.length;
        int left = 0;
        int right = n-1;
        int top = 0;
        int bottom = n-1;
        while(left <= right && top <= bottom){
            for(int col = left ; col <= right;col++){
                list.add(matrix[top][col]);
            }
            top++;
            for(int row = top ;row <= bottom;row++){
                list.add(matrix[row][bottom]);
            }
            right--;
            for(int col = right; col >= left;col--){
                list.add(matrix[bottom][col]);
            }
            bottom--;
            for(int row = bottom;row >= top ;row--){
                list.add(matrix[row][left]);
            }
            left++;

        }
        System.out.println(list);
    }
    public static void main(String[] args) {
        // Declaring a 4x4 matrix
        int[][] matrix = {
                {1,  2,  3,  4},
                {5,  6,  7,  8},
                {9,  10, 11, 12},
                {13, 14, 15, 16}
        };

        printSpiral(matrix);
    }


}
