package Arrays;
import java.util.*;
public class remove_dup_sort_Arr {
    public static void main(String[] main){
        int arr[] = {1,1,2,2,2,3,3,3,3,4,4,5};
        int i = 0;
        for(int j = 1;j < arr.length;j++){
            if(arr[i] != arr[j]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
