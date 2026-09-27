package Dsa_Java.src.Recursions.String;
import java.util.*;
public class sub_set {
    static void subseq(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseq(p,up.substring(1));
        subseq(p+ch,up.substring(1));
    }
    static ArrayList<String> subseqList(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list= new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subseqList(p,up.substring(1));
        ArrayList<String> right = subseqList(p + ch,up.substring(1));
        left.addAll(right);
        return left;
    }
    static void subseqascii(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseqascii(p,up.substring(1));
        subseqascii(p + ch,up.substring(1));
        subseqascii(p + (ch + 0),up.substring(1));
    }
    public static void main(String[] args){
        subseq("","abc");
        System.out.println(subseqList("","abcs"));
        subseqascii("","abd");
    }
}
