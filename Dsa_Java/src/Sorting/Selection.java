package Sorting;
import java.util.*;
public class Selection {
    public static void main(String[] args){
        int[] arr = {2,3,1,4,5};
        System.out.println("Unsorted array : ");
        System.out.println(Arrays.toString(arr));
        selection_sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection_sort(int[] arr){
        int n = arr.length;
        for(int i = 0;i< n-1;i++){
            int minIndex = i;
            for(int j = i+1;j<n;j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
