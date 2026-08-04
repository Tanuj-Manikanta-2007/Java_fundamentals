package Arrays.medium;
import java.util.*;
public class next_lexi_permutation {
    public static void main(String[] args){
        int nums[] = {2,1,5,4,3,0,0};
        int n =nums.length;
        int ind = -1;
        for(int i = n-2;i >= 0;i--){
            if(nums[i] < nums[i+1]){
                ind  = i;
                break;
            }
        }
        if(ind == -1) {
            reverse(nums,0,n-1);
            return;
        }
        for(int i = n-1;i > ind;i--){
            if(nums[i] > nums[ind]){
                swap(nums,i,ind);
                break;
            }
        }
        reverse(nums,ind+1,n-1);
        System.out.println(Arrays.toString(nums));
    }
    static void swap(int arr[],int s,int e){
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }
    static void reverse(int arr[],int s,int e){
        while(s < e){
            swap(arr,s,e);
            s++;
            e--;
        }
    }
}
