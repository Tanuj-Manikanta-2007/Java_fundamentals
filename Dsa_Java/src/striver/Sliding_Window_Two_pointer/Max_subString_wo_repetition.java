package striver.Sliding_Window_Two_pointer;
import java.util.*;
public class Max_subString_wo_repetition {
    public static void main(String[] main){
        String str = "pwwkew";
        System.out.println(max_substr(str));
    }
    static int max_substr(String str){
        int l = 0,r = 0, maxLen = 0,n = str.length();
        int hash[] = new int[256];
        Arrays.fill(hash,-1);
        while(r < n){
            if(l <= hash[str.charAt(r)]){
                l = Math.max(1,hash[str.charAt(r)]+1);
            }
            int len = r - l +1;
            maxLen = Math.max(len,maxLen);
            hash[str.charAt(r)] = r;
            r++;
        }
        return maxLen;
    }
}
