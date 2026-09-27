package Dsa_Java.src.String.medium;
import java.util.*;
public class longest_palindrome {
    public static void main(String args[]){
        String str1 = "babad";
        System.out.println(long_palindrome(str1));
    }
    static String long_palindrome(String str){
        int n = str.length();
        int s = 0;
        int e = 0;
        for(int i  = 0;i < n;i++){
            int len1 = is_palindrome(str,i,i);
            int len2 = is_palindrome(str,i,i+1);
            int len = Math.max(len1,len2);
            if(len > e - s){
                s = i - (len  -1)/2;
                e = i + (len/2);
            }
        }
        return str.substring(s,e+1);
    }
    static int is_palindrome(String str,int s,int e){
        while(s >= 0 && e < str.length() && str.charAt(s) == str.charAt(e) ) {

                s--;
                e++;

        }
        return e - s - 1;
    }
}
