package Arrays;
import java.util.*;
public class Reverse {
    public static void main(String[] args ){
        int arr[] = {23,45,67,89,104};
        reverse1(arr);
        System.out.println(Arrays.toString(arr));
        reverse2(arr,0);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse1(int[] arr){
        for(int i = 0;i < arr.length/2;i++){
            swap(arr,i,arr.length-i-1);
        }
        System.out.println(Arrays.toString(arr));
    }
    static void reverse2(int[] arr,int i){
        if(i >= arr.length/2) return;
        swap(arr,i,arr.length-i-1);
        reverse2(arr, i + 1);

    }
    static void swap(int arr[],int s,int e){
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }
}
