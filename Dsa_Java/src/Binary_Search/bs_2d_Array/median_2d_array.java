package Binary_Search.bs_2d_Array;
import java.util.*;
public class median_2d_array {
    public static void main(String[] args){
        int mat[][] = {
                {1, 3, 5},
                {2, 6, 9},
                {3, 6, 9}
        };
        System.out.println(median(mat));
    }
    static int median(int mat[][]){
        int n = mat.length;
        int m = mat[0].length;
        int req = (n * m + 1)/2;
        int low  = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        for(int i = 0;i < n;i++){
            low = Math.min(low,mat[i][0]);
            high = Math.max(high,mat[i][m-1]);

        }
        while(low <= high){
            int mid = (low+high)/2;
            if(possible(mid,mat,n) >= req){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return low;
    }
    static int possible(int mid,int mat[][],int n){
        int count = 0;
        for(int i = 0;i < n;i++){
            count += upperbound(mat[i],mid);
        }
        return count;
    }
    static int upperbound(int mat[],int key){
        int low = 0;
        int high = mat.length-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(mat[mid] <= key){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return low;
    }

}
