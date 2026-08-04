package Sorting.Quick_sort;
import java.util.*;
public class Quick_sort_mid {
    static void partition(int arr[],int s,int e){

        if(s >= e){
            return;
        }
        int mid = s + (e-s)/2;
        int pivot = arr[mid];
        int left = s;
        int right = e;
        while(left <= right) {

            while ( arr[left] < pivot) {
                left++;
            }
            while (arr[right] > pivot) {
                right--;
            }
            if (left <= right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            } else {
                break;
            }
        }
        partition(arr,s,right);
        partition(arr,left,e);
    }
    public static void main (String[] args){
        int arr[] = {34,78,-34,-39,0};
        partition(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
