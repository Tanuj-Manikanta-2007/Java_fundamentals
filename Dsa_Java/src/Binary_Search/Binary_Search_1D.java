package Binary_Search;

import java.util.*;
public class Binary_Search_1D {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int arr[] = new int[size];
        for (int i = 0;i<size;i++){
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        arr= sorted(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("enter the target : ");
        int target = in.nextInt();
        System.out.println(Arrays.toString(arr) + "in this array " + target + "is at " + binary_search(arr,target) + " index postion");
    }
    static int binary_search(int[] matrix,int target){
        int start = 0;
        int end = matrix.length-1;
        while(start <= end){
            int mid = start + (end/2);
            if(matrix[mid] == target){
                return mid;
            }
            else if(matrix[mid] > target){
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return -1;
    }
    static int[] sorted(int[] matrix){
        int i = 0;
        int n = matrix.length;
        while(i < n-1){
            int j = 0;
            while(j < n-i-1){
                if (matrix[j] > matrix[j+1]){
                    matrix[j] = matrix[j+1]+matrix[j];
                    matrix[j+1] = matrix[j]-matrix[j+1];
                    matrix[j] = matrix[j]-matrix[j+1];
                }
                j++;
            }
            i++;
        }
        return matrix;
    }

}
