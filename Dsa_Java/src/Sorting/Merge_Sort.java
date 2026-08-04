package Sorting;
import java.util.*;
public class Merge_Sort {
    public static void main(String[] args){
        int arr[] =  {12,-45,67,-34,6};
        System.out.println("The original Array " + Arrays.toString(arr)   );
        merge_sort(0,arr.length-1,arr);
        System.out.println(Arrays.toString(arr));
    }
    static void merge_sort(int start,int end,int arr[]){
        if(start < end){
            int mid = start + (end-start)/2;
            merge_sort(start,mid,arr);
            merge_sort(mid+1,end,arr);
            merge(start,end,mid,arr);
        }

    }
    static void merge(int start,int end,int mid,int[] arr){
        int p = start;
        int q = mid+1;
        int k = 0;
        int[] res = new int[end-start+1];
        while(p <= mid  && q <= end){
            if(arr[p] < arr[q]){
                res[k++] = arr[p++];
            }else{
                res[k++] = arr[q++];
            }
        }
        while(p <= mid){
            res[k++] = arr[p++];
        }
        while(q <= end){
            res[k++] = arr[q++];
        }
        for(int i =0;i < k;i++){
            arr[start + i] = res[i];
        }
    }
}
