package Dsa_Java.src.Recursions.Arrays;
import java.util.*;
public class Sorted {
    public static void main(String[] main){
        int arr[] = {23,45,67,89,10};
        // To Find Weather the Given Array is sorted or not
        System.out.println(Arrays.toString(arr) + " is sorted statement is " + is_sorted(arr,0));
        // To find the given element is the given array.
        System.out.println(find(arr,7,0) + " is at index at " + find_pos(arr,10,0));
        int[] arr1 = {2,4,3,5,3,4,6,7};
        int key = 4;
        System.out.println(find_key(arr1,key,0));
    }
    static boolean is_sorted(int[] arr,int n){
        if(n == arr.length- 1)  return true;
        if(arr[n] < arr[n+1] && is_sorted(arr,n+1)){
            return true;
        }
        else{
            return false;
        }
    }
    static boolean find(int[] arr,int key,int index){
        if(index == arr.length)  return false;
        if(arr[index] == key) return true;
        return  find(arr,key,index + 1);
    }
    static int find_pos(int[] arr,int key,int index){
        if(index == arr.length)  return -1;
        if(arr[index] == key) return index;
        return  find_pos(arr,key,index + 1);
    }
    static ArrayList<Integer> find_key(int[] arr,int key,int index){
        ArrayList<Integer> al1 = new ArrayList<>();
        if(index == arr.length){
            return al1;
        }
        if(arr[index] == key){
            al1.add(index);
        }
        ArrayList<Integer> al2 = find_key(arr,key,index + 1);
        al1.addAll(al2);
        return al1;
    }
}
