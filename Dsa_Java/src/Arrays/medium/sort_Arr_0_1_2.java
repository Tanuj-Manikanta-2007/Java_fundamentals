package Arrays.medium;
import java.util.*;
public class sort_Arr_0_1_2 {
    public static void main(String[] args){
        int nums[] = {0,1,2,2,1,0,1,2,0};
        int low = 0;
        int high = nums.length-1;
        int mid = 0;
        while(mid <= high){
            if(nums[mid] == 1) {
                mid++;
            }
            else if(nums[mid] == 0){
                swap(nums,low,mid);
                low++;
                mid++;
            }
            else{
                swap(nums,mid,high);
                high--;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
    static void swap(int nums[],int s,int e){
        int temp = nums[s];
        nums[s] = nums[e];
        nums[e] = temp;
    }
    // alternative method better way
    public void sortColors(int[] nums) {
        Map<Integer , Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0) + 1);
        }
        int k  = 0;
        System.out.println(map);
        for(int i = 0;i < 3;i++){
            int freq = map.getOrDefault(i,0);
            for(int j = 0; j < freq;j++){
                nums[k] = i;
                k++;
            }
        }
    }
}
