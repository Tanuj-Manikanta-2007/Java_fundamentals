package Sorting;
import java.util.*;
public class TwopointerSort {
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        int size = in.nextInt();
        System.out.println("Enter the elements");
        int[] arr = new int[size];
        for (int i = 0;i<size;i++){
            arr[i] = in.nextInt();
        }
        sort(arr,size);
        System.out.println(Arrays.toString(arr));
        System.out.println(binary(arr,size,arr[size-1]));
    }
    static void sort(int[] arr,int n){
        for(int i = 0;i < n-1;i++){
            for(int j = 0;j < n -i-1;j++){
                if (arr[j] > arr[j+1]){
                    //int temp = arr[j+1];
                    //arr[j+1] = arr[j];
                    //arr[j] = temp;
                    arr[j] = arr[j] + arr[j+1];
                    arr[j+1] = arr[j] - arr[j+1];
                    arr[j] = arr[j]- arr[j+1];
                }
            }
        }
    }
    static int binary(int[] arr,int size,int key){
        int start = 0;
        int end = size-1;
        while (start <= end){
            int mid = start + (end - start)/2;
            if (key > arr[mid]){
                start = mid+1;
            }
            else if (key < arr[mid]){
                end = mid-1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
