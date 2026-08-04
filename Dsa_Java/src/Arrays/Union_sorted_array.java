package Arrays;
import java.util.*;
public class Union_sorted_array {
    public static void main(String[] args){
        int arr1[] = {1,1,2,2,3,3,3,4,6};
        int arr2[] = {1,3,3,4,7,9};
        int m = arr1.length;
        int n = arr2.length;
        int i = 0;
        int j = 0;
        int k = 0;
        int res[] = new int[m+n];
        while(i < m && j < n){
            int current;
            if(arr1[i]  < arr2[j]){
                current = arr1[i++];
            }else if(arr1[i] > arr2[j]){
                current = arr2[j++];
            }else{
                current = arr1[i];
                i++;
                j++;
            }
            if(k == 0 || current != res[k-1]){
                res[k++] = current;
            }
        }
        while(i < m){
            if(k == 0 || arr1[i] != res[k-1]){
                res[k++] = arr1[i];
            }
            i++;
        }
        while(j < n){
            if(k == 0 || arr2[j] != res[k-1]){
                res[k++] = arr2[j];
            }
            j++;
        }
        System.out.println(Arrays.toString(res));
    }
}
