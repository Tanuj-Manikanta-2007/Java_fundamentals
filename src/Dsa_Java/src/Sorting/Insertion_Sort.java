package Dsa_Java.src.Sorting;
import java.util.*;
public class Insertion_Sort {
    public static void main(String[] args){
        int[] arr = {-12,45,63,96,0,-45};
        System.out.println(Arrays.toString(arr));
        insertion_sort(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void insertion_sort(int[] arr,int n){
        for(int i = 1;i < n;i++){
            int temp = arr[i];

            int j = i-1;
            while(j >= 0 && arr[j] > temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }
}
