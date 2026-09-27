package Dsa_Java.src.Sorting.Quick_sort;
import java.util.*;
public class Quick_sort_end {
    static int partition(int arr[],int s,int e){
        int left = s;
        int right = e-1;
        int pivot = e;
        while(left <= right){
            while(left <= right && arr[left] < arr[pivot]) left++;
            while(right >= left && arr[right] > arr[pivot]) right--;
            if(left <= right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            else break;
        }
        int temp = arr[e];
        arr[e] = arr[left];
        arr[left] = temp;
        return left;
    }
    static void quick_sort(int arr[],int s,int e){
        if(s < e){
            int pivot = partition(arr,s,e);
            quick_sort(arr,s,pivot-1);
            quick_sort(arr,pivot+1,e);
        }
    }
    public static void main(String[] args){
        int arr[] = {34,-90,-78,89,21,378};
        quick_sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
