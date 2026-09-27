package Dsa_Java.src.striver.recurssion;
import java.util.*;
public class sum_equal_to_k {
    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int arr[] = {1,2,1,3};
        sum_k(arr,3,new ArrayList<Integer>(),0,0,res);
        for(ArrayList<Integer> arrl : res){
            System.out.println(arrl.toString());
        }
    }
    static void sum_k(int arr[],int target,ArrayList<Integer> cur,int ind,int sum,ArrayList<ArrayList<Integer>> res){
        if(target == sum){
            res.add(new ArrayList<>(cur));
            return;
        }
        if(ind >= arr.length || sum > target){
            return;
        }
        int ele = arr[ind];
        cur.add(ele);
        sum_k(arr,target,cur,ind+1,sum + ele,res);
        cur.remove(cur.size()-1);
        sum_k(arr,target,cur,ind+1,sum,res);
    }
}
