package Recursions;
import java.util.*;
public class intro_recur {
    public static void main(String[] args){
        System.out.println(sum_n(5));
        System.out.println(power_n(2,5));
        int n =7;
        for(int i =0;i <= n;i++){
            System.out.print(fib_n(i) + " ");
        }
        int[] arr = {34,-56,0,98,96,21};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int start = 0;
        int end = arr.length -1;
        System.out.println(binary_search(start ,end,arr,21));
        System.out.println(binary_search_rec(start,end,arr,21));
    }
    static int sum_n(int n){
        if(n == 0) return 0;
        else return n + sum_n(n-1);
    }
    static int power_n(int num,int expo){
        if (expo == 0) return 1;
        else return num * power_n(num,expo-1);
    }
    static int fib_n(int n){
        if (n == 0 || n == 1) return n;
        else return fib_n(n-1) + fib_n(n-2);
    }
    static int binary_search(int start,int end,int[] arr,int key){
        while(start <= end){
            int mid = end + (start-end)/2;
            if(arr[mid] == key){
                return mid;
            }
            else if(arr[mid] > key){
                end = mid-1;

            }
            else{
                start = mid+1;

            }
        }
        return -1;
    }
    static int binary_search_rec(int start,int end,int[] arr,int key){
        if(start > end){
            return -1;
        }
        int mid  = end + (start -end)/2;
        if(arr[mid] == key) return mid;
        else if (arr[mid] < key){
            return binary_search_rec(mid+1,end,arr,key);
        }
        else{
            return binary_search_rec(start,mid-1,arr,key);
        }
    }
}

