package Arrays.medium;
import java.util.*;
//Input: A = [4, 2, 2, 6, 4] , k = 6
//Output: 4
//Explanation: The subarrays having XOR of their elements as 6 are  [4, 2], [4, 2, 2, 6, 4], [2, 2, 6], [6]
public class xor_of_k {
    public static void main(String[] args){
        int k = 5;
        int nums[] = {5, 6, 7, 8, 9};
        int xor = 0;
        int count = 0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int num : nums){
            xor += num;
            int target   = xor ^ k;
            if(map.containsKey(target)){
                count += map.get(target);
            }
            map.put(target,map.getOrDefault(target,0)+1);

        }
        System.out.println(k + " xor values are : " + count);
    }
}
