package Dsa_Java.src.Recursions.String;
import java.util.*;
public class Permutation {
    static void  permutation(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for(int i = 0;i <= p.length();i++){
            String f = p.substring(0,i);
            String s = p.substring(i, p.length());
            permutation(f+ch+s,up.substring(1));
        }
    }
    static ArrayList<String> permutationList(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> ls = new ArrayList<>();
            ls.add(p);
            return ls;
        }
        ArrayList<String> outer = new ArrayList<>();
        char ch = up.charAt(0);
        for(int i = 0;i <= p.length();i++){
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            outer.addAll(permutationList(f+ch+s,up.substring(1)));
        }
        return outer;
    }
    public static void main(String[] args){
        permutation("","abc");
        ArrayList<String> ls = permutationList("","abc");
        System.out.println(ls);
    }
}
