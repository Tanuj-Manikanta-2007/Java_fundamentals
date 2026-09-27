package Dsa_Java.src.Sorting.Quick_sort;
import java.util.*;
public class Quick_sort_front {
    static int partition(int arr[],int s,int e,int n){
        int left = s+1;
        int right = e;
        int pivot = arr[s];
        while(left <= right){
            while(left <= e && arr[left] < pivot) left++;
            while(arr[right] > pivot) right--;
            if(left <= right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }else{
                break;
            }

        }
        int temp = arr[s];
        arr[s] = arr[right];
        arr[right] = temp;
        return right;
    }
    static void quick_sort(int arr[],int s,int e,int n){
        if(s < e){
            int pivot = partition(arr,s,e,n);
            quick_sort(arr,s,pivot-1,n);
            quick_sort(arr,pivot+1,e,n);
        }
    }
    public static void main(String[] args){
        int arr[] = {23,67,-34,0,56,67};
        quick_sort(arr,0,arr.length-1,arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
