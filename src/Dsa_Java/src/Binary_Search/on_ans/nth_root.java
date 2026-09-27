package Dsa_Java.src.Binary_Search.on_ans;
import java.util.*;
public class nth_root {
    public static  void main(String[] args){
        System.out.println(root(27,3));
    }
    static int root(int num,int n){
        int low = 1;
        int high = num;
        int ans = -1;
        while(low <= high){
            int mid = low + (high- low)/2;
            if(power(mid,n) < num){
                low = mid+1;
            }
            else if(power(mid,n) == num){
                return mid;
            }
            else{
                high = mid-1;
            }
        }
        return ans;
    }
    static int power(int num,int n){
        long ans = 1;
        for(int i = 0;i < n;i++){
            ans *= num;
        }
        return (int)ans;
    }
}
