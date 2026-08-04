package Binary_Search;
import java.util.*;
public class two_d_binary_search {
    public static void main(String[] args){
        int arr[][] =  { {0,0,1,1},{0,0,1,1},{0,1,1,1},{0,0,1,1} };
        int res = -1;
        int ind  =-1;
        for(int i = 0;i < arr.length;i++){
            int lb = lower_bound(arr[i],1);
            if(lb != -1){
                int cb = arr.length - lb;
                if(cb > res){
                    res = cb;
                    ind = i;
                }
            }
        }
        System.out.println(" Max number of one's : " + ( res) + " at index : "+ ind );

    }
    static int lower_bound(int arr[],int num){
        int low = 0;
        int high = arr.length-1;
        int ans = -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] >= num){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }

        }
        return ans;
    }

}
