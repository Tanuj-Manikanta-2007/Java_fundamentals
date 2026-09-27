package Dsa_Java.src.Sorting;
import java.util.*;
public class Cyclic {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 4, 2, 7, 6};
        int n = arr.length;
        int i = 0;
        while (i < n) {
            int index = arr[i]-1;
            if(arr[i] != arr[index]){
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
            }
            else{
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
