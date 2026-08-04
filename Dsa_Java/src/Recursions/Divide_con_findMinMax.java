package Recursions;
import java.util.*;
public class Divide_con_findMinMax {
    public static void main(String[] args){
        int[] arr = {23,45,0,-45,-67,76};
        int[] res = findMaxMin(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr) + "  \n" + "Min : " + res[0] + " Max : " + res[1]);
    }
    static int[] findMaxMin(int arr[],int s,int e){
        if(s == e) return new int[]{arr[0],arr[0]};
        if(e-s == 1){
            if(arr[s] < arr[e]){
                return new int[]{arr[s],arr[e]};
            }
            return new int[]{arr[e],arr[s]};
        }
        int mid = s + (e-s)/2;
        int[] arr1 = findMaxMin(arr,s,mid);
        int[] arr2 = findMaxMin(arr,mid+1,e);
        return new int[]{Math.min(arr1[0],arr2[0]),Math.max(arr1[1],arr2[1])};
    }
}
