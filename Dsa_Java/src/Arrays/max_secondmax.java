package Arrays;
import java.util.*;
public class max_secondmax {
    public static void main(String[] args){
        int arr[] = {12,12,56,-90,456,456};
        int max1 = arr[0];
        int max2 = Integer.MIN_VALUE;
        for(int i  = 1;i < arr.length;i++){
            if(arr[i] > max1){
                max2 = max1;
                max1 = arr[i];
            }
            if(arr[i] > max2 && arr[i] != max1){
                max2 = arr[i];
            }
        }
        System.out.println(max1 + "    " + max2);
    }
}
