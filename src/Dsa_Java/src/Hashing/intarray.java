package Dsa_Java.src.Hashing;
import java.util.*;

public class intarray {
    int arr1[] = new int[10000000];
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,1,2,3,2,3};
        int [] freq = new int[6];
        for(int i : arr){
            freq[i]++;
        }
        System.out.println(Arrays.toString(freq));
    }
}
