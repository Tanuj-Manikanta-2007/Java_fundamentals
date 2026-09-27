package Dsa_Java.src.Recursions;
import java.util.*;
public class Rotated_binary_search {
    static int search(int arr[],int key,int s,int e){
        if(s > e){
            return -1;
        }
        int m = s + (e - s)/2;
        if(arr[m] == key){
            return m;
        }
        if(arr[s] <= arr[m]){
            if(key >= arr[s] && key <= arr[e] ){
                return search(arr,key,s,m-1);
            }
            else{
                return search(arr,key,m+1,e);
            }
        }
        if(key >= arr[m] && key <= arr[e] ){
            return search(arr,key,m+1,e);
        }
        return search(arr,key,s,m-1);
    }
    public static void main(String[] args){
        int arr[] = {4,5,6,7,8,1,2,3};
        System.out.println(search(arr,7,0,arr.length-1));
    }
}
/*import java.util.*;

public class Main{
    static int search(int arr[],int key,int s,int e){

        while(s <= e){
            int mid = s + (e-s)/2;
            if(arr[mid] == key) return mid;
            if(arr[s] <= arr[mid]){
                if(arr[s] <= key && arr[mid] >= key){
                    e = mid-1;
                }
                else{
                    s = mid+1;
                }
            }
            else{
            if(arr[mid] <= key && arr[e] >= key ){
                s = mid+1;
            }else{
                e = mid-1;
            }
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int arr[] = {4,5,6,7,1,2,3};
        System.out.println(search(arr,2,0,arr.length-1));
    }
  } */
