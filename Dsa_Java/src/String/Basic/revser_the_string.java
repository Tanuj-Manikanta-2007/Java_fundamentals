package String.Basic;
import java.util.*;
public class revser_the_string {
    public static void main(String[] args){
        String str1 = " amazing coding skills ";
        System.out.println(revserse1(str1));//brute force or normal solution
        System.out.println(reverse2(str1));//optimal solution
    }
    static String revserse1(String org){
        String[] strarr = org.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        int n = strarr.length;
        for(int i =0;i < n;i++ ){
            String str = strarr[n-i-1];
            if(sb.length() > 0){
                sb.append(" ");
            }
            sb.append(str);
        }
        return sb.toString();
    }
    static String reverse2(String org){
        StringBuilder sb = new StringBuilder();
        int i = org.length()-1;
        while(i >= 0){
            while(i >= 0 && org.charAt(i) == ' '){
                i--;
            }
            if(i < 0) break;
            int end = i;
            while(i >= 0 && org.charAt(i) != ' '){
                i--;
            }
            String word  = org.substring(i+1,end+1);
            if(sb.length() > 0){
                sb.append(" ");
            }
            sb.append(word);
        }
        return sb.toString();
    }
}
