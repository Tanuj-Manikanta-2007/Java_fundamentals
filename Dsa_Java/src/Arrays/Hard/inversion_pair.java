package Arrays.Hard;
import java.util.*;
//Example 3:
//Input Format: N = 5, array[] = {5,3,2,1,4}
//Result: 7
//Explanation: There are 7 pairs (5,1), (5,3), (5,2), (5,4),(3,2), (3,1), (2,1) and we have left 2 pairs (2,4) and (1,4) as both are not satisfy our condition.
public class inversion_pair {
    public static void main(String[] args){
        int arr[] = {5,3,2,1,4};
        System.out.println("Inversion pairs : " + merge(arr,0,arr.length-1));
    }
    static int merge(int arr[],int s,int e){
        int count = 0;
        if(s  < e){
            int mid = s + (e-s)/2;
            count +=  merge(arr,s,mid);
            count +=  merge(arr,mid+1,e);
            count += merge_sort(arr,s,mid,e);
        }
        return count;

    }
    static int merge_sort(int arr[],int s,int mid,int e){
        int p = s;
        int q = mid+1;
        int k = 0;
        int res[] = new int[e-s+1];
        int count = 0;
        while(p <= mid && q <= e){
            if(arr[p] <= arr[q]){
                res[k++] = arr[p++];
            }
            else{
                res[k++] = arr[q++];
                count += (mid - p +1);
            }
        }
        while(p <= mid){
            res[k++] = arr[p++];
        }
        while(q <= e){
            res[k++] = arr[q++];
        }
        for(int i = s;i <= e;i++){
            arr[i] = res[i-s];
        }
        return count;
    }

}
