package Desing_algorithm_analysis.src.lab2;
import java.util.*;
public class bubble_sort {
    public static void main(String[] args){
        int arr1[] = {23,-15,-17,0,56,98,66};
        bubble_sort_ver1(arr1,arr1.length-1);
        int arr2[] = {23,-15,-17,0,56,98,66};
        bubble_sort_ver2(arr2,arr1.length-1);
        int arr3[] = {23,-15,-17,0,56,98,66};
        selection_sort(arr2,arr1.length-1);
    }
    static void bubble_sort_ver1(int arr[] ,int n){
        int count = 0;
        for(int i  = 0;i < n-1;i++){
            for(int j = 0;j < n-i-1;j++){

                if(arr[j] > arr[j+1]){
                    swap(arr,j,j+1);
                }
                count += 1;
            }
        }
        System.out.println(Arrays.toString(arr) + " taken " + count + " steps");
    }

    static void bubble_sort_ver2(int arr[],int n){
        int count = 0;

        for(int i  = 0;i < n-1;i++){
            boolean is_sorted = false;
            for(int j = 0;j < n-i-1;j++){
                count += 1;
                if(arr[j] > arr[j+1]){
                    is_sorted = true;
                    swap(arr,j,j+1);
                }
            }
            if(!is_sorted) break;
        }
        System.out.println(Arrays.toString(arr) + " taken " + count + " steps");
    }
    static void selection_sort(int arr[],int n){
        int count = 0;
        for(int i = 0; i < n-1;i++){
            for(int j = i+1;j < n;j++){
                count += 1;
                if(arr[i] > arr[j]){
                    swap(arr,i,j);
                }
            }
        }
        System.out.println(Arrays.toString(arr) + " steps " + count);
    }
    static void swap(int arr[],int f,int s){
        int temp = arr[s];
        arr[s] = arr[f];
        arr[f] = temp;
    }
}
