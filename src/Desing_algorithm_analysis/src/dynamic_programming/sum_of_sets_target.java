package Desing_algorithm_analysis.src.dynamic_programming;
// thhis problem is that but thhere will give the array your task is find weather sum subserts are equal to the target
// by including and excluding principle we are gonna do this problem
import java.util.*;
public class sum_of_sets_target {
    public static void main(String[] args){
        int arr[] = {2,4,6,8,7,5,3};
        int target = 10;
        sum_subsets(arr,target,0,0,new ArrayList<> ());
    }
    static void sum_subsets(int arr[],int target,int sum,int ind,ArrayList<Integer> res){
        if(sum == target){
            System.out.println(res);
            return;
        }
        if(ind == arr.length || sum > target){
            return;
        }
        res.add(arr[ind]);
        sum_subsets(arr,target,sum+arr[ind],ind+1,res);
        //exclude
        res.remove(res.size() -1);
        sum_subsets(arr,target,sum,ind+1,res);
    }
}
