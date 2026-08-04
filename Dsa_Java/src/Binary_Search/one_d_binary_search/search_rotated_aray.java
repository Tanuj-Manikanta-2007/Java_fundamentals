package Binary_Search.one_d_binary_search;
import java.util.*;
//Input: nums = [4,5,6,7,0,1,2], target = 0
//Output: 4
//Example 2:
//
//Input: nums = [4,5,6,7,0,1,2], target = 3
//Output: -1
public class search_rotated_aray {
    public static void main(String[] args) {
        int nums[] = {4, 5, 6, 7, 0, 1, 2};
        search(nums, 2);
        search(nums, 3);
    }
    static void search(int nums[],int target){
        int s = 0;
        int e = nums.length-1;
        while(s <= e){
            int mid = (s + e)/2;
            if(nums[mid] == target) {
                System.out.println("target : " + target + " at index : " + mid);
                return;
            }
            if(nums[s] <= nums[mid]){
                if(target >= nums[s] && target < nums[mid]){
                    e = mid-1;
                }
                else{
                    s = mid+1;
                }
            }
            else{
                if(target > nums[mid] && target < nums[e]){
                    s = mid+1;
                }
                else{
                    e = mid-1;
                }
            }
        }
        System.out.println("target : " + target + " is not present in the array ");
    }
}
