package Dsa_Java.src.Recursions.Arrays;
import java.util.*;
public class al_search {
    static ArrayList<Integer> search1(int arr[],int key,int s){
        ArrayList<Integer> res = new ArrayList<>();
        if(s == arr.length){
            return res;
        }
        if(arr[s] == key){
            res.add(s);
        }
        ArrayList<Integer> list = search1(arr,key,s+1);
        res.addAll(list);
        return res;
    }
    public static void main(String[] args){
        int arr[] = {1,2,3,4,4,-4,5};
        System.out.println(search1(arr,4,0));
    }
}
