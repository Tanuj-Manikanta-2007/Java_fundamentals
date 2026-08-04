package Binary_Search.one_d_binary_search;
import java.util.*;
public class no_times_rotated {
    public static  void main(String[] arggs){
        int arr[] = {3,4,5,1,2};
        no_time_rotated(arr);
    }
    static  void no_time_rotated(int arr[]){
        int s = 0;
        int e = arr.length-1;
        int min = Integer.MAX_VALUE;
        int ind = -1;
        while(s <= e){
            int mid = s + (e -s)/2;
            if(arr[s] <= arr[mid]){
                if(arr[s] <= min){
                    min = arr[s];
                    ind = s;

                }
                e = mid-1;
            }else{
                if(arr[mid] <= arr[e]){
                    if(arr[mid] <= min){
                        min = arr[e];
                        ind = e;
                    }
                    s = mid+1;
                }
                else{
                    e = mid-1;
                }
            }
        }
        System.out.println(min + " times rotated ");
    }
}
