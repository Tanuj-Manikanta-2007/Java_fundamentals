package Dsa_Java.src.String.Basic;
import java.util.*;
public class longest_odd_num {
    public static void main(String[] args){
        System.out.println(long_odd("021463"));
    }
    static String long_odd(String org){
        int n = org.length()-1;
        int ind = -1;
        for(int i = n;i >= 0;i--){
            if((org.charAt(i)-'0')%2 == 1){
                ind = i;
                break;
            }
        }
        int i = 0;
        while(i <= ind && org.charAt(i)-'0' == 0 ){
            i++;
        }
        return org.substring(i,ind+1);
    }
}
