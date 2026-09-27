package Dsa_Java.src.Arrays;
import java.util.*;
public class find_freq_1 {
    public static void main(String[] args){
        int nums[] = {1,1,2,3,4,3,4};
        System.out.println(by_set(nums));
        System.out.println(by_hashmap(nums));
    }
    static int by_set(int[] arr){
        Set<Integer> set1 = new HashSet<>();
        int sum1 = 0;
        for(int num : arr){
            set1.add(num);
            sum1 += num;
        }
        int sum2 = 0;
        for(int num : set1){
            sum2 += num;
        }
        return sum2 * 2 - sum1;

    }
    static int by_hashmap(int[] arr){
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num,(map.getOrDefault(num,0) + 1));
        }
        
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() == 1) return entry.getKey();
        }
        return -1;
    }
}
