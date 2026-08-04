package Binary_Search.one_d_binary_search;
import java.util.*;
public class ocuurences_bs {
    public static void main(String[] main){
        int[] arr = {2,3,4,4,4,4,5,6};
        int s = 0;
        int e = arr.length-1;
        int low = -1;
        int target = 4;
        while(s <= e){
            int mid = s + (e-s)/2;
            if(arr[mid] == target){
                low = mid;
                e = mid-1;
            }
            else if(target > arr[mid]){
                s = mid+1;
            }
            else{
                e = mid-1;
            }
        }
        s = 0;
        e = arr.length-1;
        int high = -1;
        while(s <= e){
            int mid = s + (e-s)/2;
            if(arr[mid] == target){
                high = mid;
                s = mid+1;
            }
            else if(target > arr[mid]){
                s = mid+1;
            }
            else{
                e = mid-1;
            }
        }
        System.out.println(target + " ocuurence is " + (high-low+1));
        // By hashMap 
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num,(map.getOrDefault(num,0) + 1));
        }
        System.out.println(target + " ocuurence is " + map.getOrDefault(target,-1));

    }
}
