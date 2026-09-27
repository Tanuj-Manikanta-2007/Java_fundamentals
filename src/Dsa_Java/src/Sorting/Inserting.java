package Dsa_Java.src.Sorting;
import java.util.*;
public class Inserting {
    // Stable and used in small data
    // most efficient against the partially sorted array
    public static void main (String[] args){
        int[] arr = {11,13,12,15,14};
        System.out.println(Arrays.toString(arr));
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertion(int[] arr){
        int n = arr.length;
        for(int i = 0;i< n-1;i++){
            for(int j = i+1;j > 0;j--){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
                else{
                    break;
                }
            }
        }
    }
}
