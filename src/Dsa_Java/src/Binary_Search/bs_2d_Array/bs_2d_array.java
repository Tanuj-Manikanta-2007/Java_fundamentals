package Dsa_Java.src.Binary_Search.bs_2d_Array;
import java.util.*;
public class bs_2d_array {
    public static void main(String[] args){
        int matrix[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        int key  =32;
        System.out.println(search(matrix,key));
    }
    public static boolean search(int matrix[][],int key){
        int low = 0;
        int n = matrix.length;
        int m = matrix[0].length;
        int high = n * m -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            int row = mid/m;
            int col = mid % m;
            if(matrix[row][col] == key){
                return true;
            }
            else if(matrix[row][col] < key){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return false;
    }
}
