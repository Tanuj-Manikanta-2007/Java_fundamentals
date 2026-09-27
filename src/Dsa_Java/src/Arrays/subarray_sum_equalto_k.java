package Dsa_Java.src.Arrays;
import java.util.*;
public class subarray_sum_equalto_k {
    public static void main(String[] args){
        int arr[] = {1,2,3,3,1,1,1,3,4};
        int left = 0;
        int right = 0;
        int maxLen = 0;
        int sumn = 0;
        int k = 6;
        int n = arr.length;
        while(right < n){
            sumn += arr[right];
            while(left <= right && sumn > k){
                sumn -= arr[left];
                left++;
            }
            if(sumn == k){
                maxLen = Math.max(maxLen,right-left+1);
            }
            right++;
        }

        System.out.println(maxLen);
    }
}
