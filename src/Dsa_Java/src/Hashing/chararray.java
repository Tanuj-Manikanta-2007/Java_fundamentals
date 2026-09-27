package Dsa_Java.src.Hashing;
import java.util.*;
public class chararray {
    public static void main(String[] args){
        String str1 = "ganeshtanujmanikanta";
        int[] freq = new int[26];
        for(int i = 0;i < str1.length();i++){
            char ch = str1.charAt(i);
            freq[ch-'a']++;
        }
        System.out.println(Arrays.toString(freq));

        String str2 = "oweratanuj@2007%%%";
        int[] freq1 = new int[256];
        for(int i = 0;i < str2.length();i++){
            char ch = str2.charAt(i);
            freq1[ch]++;
        }
        System.out.println(Arrays.toString(freq1));
    }
}
