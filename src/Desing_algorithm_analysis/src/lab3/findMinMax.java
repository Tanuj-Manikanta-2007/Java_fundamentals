package Desing_algorithm_analysis.src.lab3;
import java.util.*;
public class findMinMax {
    public static void main(String[] args){
        int[] res = new int[2];
        int arr[] = {-9,0,45,67,89,-17,90};
        res = findminmax(arr,0,arr.length-1);
        System.out.println("Minimum : " + res[0] + " Maximum : " + res[1]);
    }
    static int[] findminmax(int arr[],int s,int e){
        if(s == e){
            return new int[]{arr[s],arr[s]};
        }
        if(e - s == 1){
            if(arr[s] > arr[e]) return new int[]{arr[e],arr[s]};
            return new int[]{arr[s],arr[e]};
        }
        int mid = s + (e-s)/2;
        int arr1[] = findminmax(arr,s,mid-1);
        int arr2[] = findminmax(arr,mid,e);
        int min = Math.min(arr1[0],arr2[0]);
        int max = Math.max(arr1[1],arr2[1]);
        return new int[]{min,max};
    }

}
