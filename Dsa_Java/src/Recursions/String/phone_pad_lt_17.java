package Recursions.String;
import java.util.*;
public class phone_pad_lt_17 {
    static void pad(String p,String up){
        if(up.isEmpty()){
            System.out.println(p + " ");
            return;
        }
        int digit = up.charAt(0) - '0';
        for(int i = (digit-1) * 3;i < (digit) * 3;i++){
            char ch = (char) ('a' + i);
            pad(p+ch,up.substring(1));
        }
    }
    public static void main(String[] args){
        pad("","12");
    }
}
