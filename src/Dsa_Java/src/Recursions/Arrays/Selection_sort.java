package Dsa_Java.src.Recursions.Arrays;
import java.util.*;
public class Selection_sort {
    static void selection(int[] arr,int s,int e,int max){
        if(s == 0) return;
        if(e <= s){
            if(arr[e] > arr[max]){
                selection(arr,s,e+1,e);
            }
            else{
                selection(arr,s,e+1,max);
            }
        }else{
            int temp = arr[max];
            arr[max ] = arr[s];
            arr[s] = temp;
            selection(arr,s-1,0,0);
        }
    }
    public static void main(String[] args){
        int arr[] = {9,34,23,12,-34};
        selection(arr,arr.length-1,0,0);
        System.out.println(Arrays.toString(arr));
    }
}
