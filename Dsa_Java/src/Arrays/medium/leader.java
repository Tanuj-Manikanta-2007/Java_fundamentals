package Arrays.medium;
import java.util.*;
public class leader {
    public static void main(String[] args){
        int arr[] = {5,3,4,8,7,-1,0};
        opti_lader(arr);
        System.out.println();
        System.out.print(arr[arr.length-1] + " ");
        for(int i = arr.length - 2;i >= 0;i--){
            if(right(arr,i+1,arr[i])) {
                System.out.print(arr[i] + " ");
            }
        }
    }
    static boolean right(int arr[],int ind,int ele){
        if(ind == arr.length-1 && ele > arr[ind])
            return true;
        else if(ele > arr[ind]){
            return right(arr,ind+1,ele);
        }
        else {
            return false;
        }
    }
    static void opti_lader(int arr[]){
        int n = arr.length;
        int max = n-1;
        System.out.print(arr[max] + " ");
        for(int i = n - 2;i >= 0;i--){
            if(arr[i] > max){
                max = arr[i];
                System.out.print(arr[i] + " ");
            }
        }
    }

}
