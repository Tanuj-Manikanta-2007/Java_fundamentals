package striver.Sliding_Window_Two_pointer;
import java.util.*;
public class fruits_in_baskets {
    public static void main(String[] args){
        int[] fruits ={3,3,3,1,2,1,1,2,3,3,4};
        System.out.println(max_two_fruits_in_basket(fruits));
        System.out.println(max_two_fruits_in_basket2(fruits));
    }
    static int max_two_fruits_in_basket(int fruits[]){
        int l = 0,r = 0,maxLen = 0,n = fruits.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        while(r < n){
            map.put(fruits[r],map.getOrDefault(fruits[r],0)+1);
            while(map.size() > 2){
                map.put(fruits[l],map.get(fruits[l])-1);
                if(map.get(fruits[l]) == 0) map.remove(fruits[l]);
                l++;
            }
            int len = r - l +1;
            maxLen= Math.max(len,maxLen);
            r++;
        }
        return maxLen;
    }
    static int max_two_fruits_in_basket2(int[] fruits){
        int l = 0,r = 0, maxLen = 0,n = fruits.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        while(r < n){
            map.put(fruits[r],map.getOrDefault(fruits[r],0)+1);
            if(map.size() > 2){
                map.put(fruits[l],map.getOrDefault(fruits[l],0)-1);
                if(map.get(fruits[l]) == 0) map.remove(fruits[l]);
                l++;
            }
            else{
                int len = r - l +1;
                maxLen= Math.max(len,maxLen);
            }
            r++;
        }
        return maxLen;
    }
}
