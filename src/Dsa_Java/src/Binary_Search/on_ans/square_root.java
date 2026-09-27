package Dsa_Java.src.Binary_Search.on_ans;
import java.util.*;
//Input: N = 36
//Output: 6
//Explanation: Square root of 36 is 6.
//Input: N = 28
//Output: 5
//Explanation: Square root of 28 is approximately 5.292. So, the floor value will be 5.
public class square_root {
    public static void main(String[] main){
        int num = 39;
        int low = 1;
        int e = num;
        int ans = -1;
        while(low <= e){
            int mid = low+ (e - low)/2;
            if(mid * mid <= num){
                low = mid+1;
                ans = mid;
            }
            else{
                e = mid-1;
            }
        }
        System.out.println(num  + " square root is : " + ans );
        // another method
        int i = 0;
        while(i * i <= num){
            i++;
        }
        System.out.println(num  + " square root is : " + (i-1));
    }
}
