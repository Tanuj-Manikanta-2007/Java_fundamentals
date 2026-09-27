package Dsa_Java.src.Arrays.medium;
import java.util.*;
public class sub_arr_max_len {
    public static void main(String args[]){
        Map<Integer,Integer> set = new HashMap<>();
        int arr[] = {9, -3, 3, -1, 6, -5};
        int maxi = 0;
        int sumn = 0;//
        int target  =0;
        int maxk = Integer.MIN_VALUE;
        int sumk = Integer.MIN_VALUE;
        for(int i = 0;i < arr.length;i++){
            sumn += arr[i];
            maxk = Math.max(sumn,maxk);
            sumk = Math.max(sumk,maxk);
            if(sumn == target){
                maxi = i+1;
            }
            else{
                if(set.get(sumn) != null){
                    maxi = Math.max(maxi,i - set.get(sumn));
                }
                else{
                    set.put(sumn,i);
                }
            }

        }
        System.out.println("longest subarray of sum target :" + maxi + "\nLongest subarray sum : " + sumk);
    }
}
