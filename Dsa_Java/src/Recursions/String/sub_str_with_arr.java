package Recursions.String;
import java.util.*;
public class sub_str_with_arr {
    static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num : arr){
            int n = outer.size();
            for(int i  = 0;i < n;i++){
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }
    static List<List<Integer>> subsetDup(int arr[]){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start = 0,end = 0;
        for(int i = 0;i < arr.length;i++){
            start = 0;
            if(i > 0 && arr[i] == arr[i-1]){
                start = end+1;
            }
            end = outer.size() -1;
            int n = outer.size();
            for(int j = start;j < n;j++){
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }
    public static void main(String[] args){
        int[] arr=  {2,3,4};
        List<List<Integer>> ans = subset(arr);
        for(List<Integer> list : ans){
            System.out.println(list);
        }
        int[] arr1=  {3,3,4};
        List<List<Integer>> ans1 = subsetDup(arr1);
        for(List<Integer> list : ans1){
            System.out.println(list);
        }
    }
}
