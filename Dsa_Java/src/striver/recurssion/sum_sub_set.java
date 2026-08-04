package striver.recurssion;
import java.util.*;
public class sum_sub_set {

    public static void main(String[] args){
        int arr[] = {3,1,4};
        ArrayList<Integer> res = new ArrayList<>();
        sum_ofSet(arr,0,0,res);
        System.out.println(res + " -->  "+ Arrays.toString(arr));
    }

    public static void sum_ofSet(int arr[],int ind,int sum,ArrayList<Integer> res){
        int n = arr.length;
        if(ind == n){
            res.add(sum);
            return;
        }
        int ele = arr[ind];
        sum_ofSet(arr,ind+1,sum+ele,res);
        sum_ofSet(arr,ind+1,sum,res);
    }
}

