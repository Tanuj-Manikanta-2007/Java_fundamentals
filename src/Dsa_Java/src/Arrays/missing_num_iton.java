package Dsa_Java.src.Arrays;
import java.util.*;
public class missing_num_iton {
    public static void main(String[] args){
        int arr[] = {1,7,3,4,5,6};
        int sumn = 0;
        for(int num : arr){
            sumn += num;
        }
        System.out.println( sum_n(arr.length+1) - sumn);

    }
    static int sum_n(int n){
        if(n == 0) return 0;
        else return n + sum_n(n-1);
    }
}
