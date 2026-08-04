package lab3;
import java.util.*;
public class matrixmul {
    public static void main(String[] args){
        int[][] arr1 = {{1,2},{3,4}};
        int[][] arr2 = {{5,6},{7,8}};
        int[][] res = new int[2][2];
        res = Matrix_mul(arr1,arr2);
        System.out.println(Arrays.toString(res[0] ) + "  " + Arrays.toString(res[1] ));
    }
    static int[][] Matrix_mul(int arr1[][],int arr2[][]){
        int r1 = arr1.length;
        int r2 = arr2.length;
        int c1 = arr1[0].length;
        int c2 = arr2[0].length;
        if(r1 != c1){
            System.out.println("Not possible ");
            return new int[][]{{-1},{-1}};
        }
        int[][] res = new int[r1][c1];
        int lenr = 0;
        for(int i = 0;i < r1;i++){
            int[] temp = new int[r1];
               int lent = 0;
            for(int j = 0;j < c1;j++){

                int sumn = 0;
                for(int k = 0;k < r1;k++){
                    sumn += arr1[i][k] * arr2[k][j];
                }
                temp[lent] = sumn;
                lent += 1;
            }
            res[i] = temp;

        }
        return res;
    }
}
