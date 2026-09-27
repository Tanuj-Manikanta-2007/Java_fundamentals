package Dsa_Java.src.Sorting;
import java.util.*;
public class Sorting {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the size of the array : ");
        int size = in.nextInt();
        int[] arr = new int[100];
        for(int i = 0;i<size;i++){
            arr[i] = in.nextInt();
        }
        int index = in.nextInt();
        int element = in.nextInt();
        for(int i = size;i >= index;i--){
            arr[i] = arr[i-1];
        }
        arr[index-1] = element;
        size++;
        for(int i = 0;i<size;i++){
            System.out.printf("%d ",arr[i]);
        }
    }
}

