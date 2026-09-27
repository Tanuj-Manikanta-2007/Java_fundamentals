package Dsa_Java.src.Arrays.medium;
import java.util.*;
public class majority_ele_nby2 {
    public static void main(String[] args){
        int nums[] = {2,2,1,1,1,2,2};
        int n = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0) + 1);
            if(map.get(num) > n/2){
                //return num;
            }
        }
        //return -1;
    }
}
