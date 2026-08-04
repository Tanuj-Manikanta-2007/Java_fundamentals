package Binary_Search;
import java.util.*;
public class Binary_Search_2D {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("The rows && The columns : ");
        int rows = in.nextInt();
        int columns = in.nextInt();
        int[][] matrix = new int[rows][columns];
        int i = 0;
        while(i < rows){
            int j = 0;
            while(j < columns){
                matrix[i][j] = in.nextInt();
                j++;
            }
            i++;
        }
        int k = 0;
        while(k < rows){
            System.out.println(Arrays.toString(matrix[k]));
            k++;
        }
        sort(matrix);
        int k1 = 0;
        while(k1 < rows){
            System.out.println(Arrays.toString(matrix[k1]));
            k1++;
        }
        System.out.println("Element to search : ");
        int target = in.nextInt();
        System.out.println(" the "+ target + " in the arrays is " + "row : " + search(matrix,target)[0] + "columns : " + search(matrix,target)[1]);
    }
    static int[] search(int[][] arr,int tar){
        int rows = 0;
        int columns = arr[0].length-1;
        while(rows < arr.length && columns >= 0){
            if (arr[rows][columns] < tar){
                rows++;
            }
            else{
                columns--;
            }
            if (arr[rows][columns] == tar){
                return new int[] {rows,columns};
            }
        }
        return new int[]{-1,-1};
    }
    static void sort(int[][] matrix){
        int i  = 0;
        while(i < matrix.length){
            int[] arr = matrix[i];
            int j = 0;
            int n = arr.length;
            while(j < n-1){
                int k = 0;
                while(k < n-j-1){
                    if (arr[k] > arr[k+1]){
                        arr[k] = arr[k] + arr[k+1];
                        arr[k+1] = arr[k] - arr[k+1];
                        arr[k] = arr[k] - arr[k+1];
                    }
                    k++;
                }
                j++;
            }
            i++;
        }

    }
}
