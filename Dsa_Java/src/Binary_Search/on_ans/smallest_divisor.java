package Binary_Search.on_ans;
import java.util.*;
//Example 1:
//
//Input: nums = [1,2,5,9], threshold = 6
//Output: 5
//Explanation: We can get a sum to 17 (1+2+5+9) if the divisor is 1.
//If the divisor is 4 we can get a sum of 7 (1+1+2+3) and if the divisor is 5 the sum will be 5 (1+1+1+2).
//Example 2:
//
//Input: nums = [44,22,33,11,1], threshold = 5
//Output: 44
public class smallest_divisor {
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = max(nums);
        int ans = -1;
        while(low <= high){
            int mid =  low + (high - low)/2;
            if(possible(nums,mid,threshold)){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
    static int max(int nums[]){
        int max = Integer.MIN_VALUE;
        for(int num : nums){
            if(num > max){
                max = num;
            }
        }
        return max;
    }
    static boolean possible(int nums[],int div,int limit){
        int res = 0;
        for(int num : nums){
            res += (num + div - 1)/div;
        }
        return res <= limit;
    }
}
