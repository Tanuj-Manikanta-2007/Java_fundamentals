package Binary_Search.on_ans;
import java.util.*;
public class agressive_cows {
    public static void main(String[] args){
        int k = 4;
        int arr[] = {0,3,4,7,10,9};
        System.out.println(agressive_cow(arr,k));
    }
//    static int agressive_cow(int arr[],int k){
//        Arrays.sort(arr);
//        int low =1;
//        int ans = -1;
//        int high = arr[arr.length-1] - arr[0];
//        while(low <= high){
//            int mid = low + (high - low)/2;
//            if(possible(arr,mid,k)){
//                ans = mid;
//                low = mid+1;
//            }
//            else{
//                high = mid-1;
//            }
//        }
//        return ans;
//    }
//    static boolean possible(int arr[],int minDist,int cows){
//        int count_cow = 1;
//        int last_dis = arr[0];
//        for(int i = 1;i < arr.length;i++){
//            if(arr[i] - last_dis >= minDist){
//                count_cow++;
//                last_dis = arr[i];
//            }
//            if(count_cow >= cows) return true;
//        }
//        return false;
//    }
    static int agressive_cow(int arr[],int k ){
        Arrays.sort(arr);
        int low = 0;
        int ans = -1;
        int high = (arr[arr.length-1] - arr[0]);
        while(low <= high){
            int mid = low + (high - low)/2;
            if(possible(arr,mid,k)){
                ans = mid;
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return ans;
    }
    static boolean possible(int arr[],int minDist,int k ){
        int count = 1;
        int last_dis = arr[0];
        for(int i = 1;i < arr.length;i++){
            if(arr[i] - last_dis >= minDist){
                count++;
                last_dis = arr[i];
            }
            if(count >= k) return true;
        }
        return false;
    }
}
