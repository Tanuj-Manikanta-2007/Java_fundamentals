package String.Basic;
import java.util.*;
public class longest_common_prefix {
    public static void main(String[] main){
        String str[] = {"flower", "flow", "flight"};
        String str1[] = {"apple", "banana", "grape", "mango"};
        System.out.println(common_prefix(str));
        System.out.println(common_prefix(str1));
    }
    static String common_prefix(String[] str){
        Arrays.sort(str);
        int ind  = 0;
        int small = str[0].length();
        int longs = str[str.length-1].length();
        int min = -1;
        if(small < longs){
            min = small;
        }
        else{
            min = longs;
        }
        for(int i = 0;i < min;i++){
            if(str[0].charAt(i) == str[str.length-1].charAt(i) ){
                ind++;
            }
        }
        if(ind == -1) return "";
        return str[0].substring(0,ind);
    }
}
