package Dsa_Java.src.Binary_Search.one_d_binary_search;
import java.util.*;
//Example 1:
//
//Input: nums = [1,3,5,6], target = 5
//Output: 2
//Example 2:
//
//Input: nums = [1,3,5,6], target = 2
//Output: 1
//Example 3:
//
//Input: nums = [1,3,5,6], target = 7
//Output: 4
public class search_insert {
    public static void main(String[] args){
        int arr[] = {2,3,5,6,7};
        search_sort(arr,4);
        search_sort(arr,9);
    }
    static void search_sort(int arr[],int key){
        int s = 0;
        int e = arr.length-1;
        while(s <= e){
            int mid = s + (e-s)/2;
            if(arr[mid] == key){
                System.out.println(mid);
                return;
            }
            else if(arr[mid] > key){
                e = mid-1;
            }else{
                s = mid+1;
            }
        }
        System.out.println(s);
    }
}
