package Dsa_Java.src.String.Basic;
import java.util.*;
public class isomorphic {
    public static void main(String[] args){
        String s1 = "foo";
        String t1 = "bar";
        String s2 = "paper";
        String t2 = "title";
        System.out.println(is_isomorphic(s1,t1));
        System.out.println(is_isomorphic(s2,t2));
        System.out.println(is_isomorphic1(s1,t1));
        System.out.println(is_isomorphic1(s2,t2));
    }
    static boolean is_isomorphic(String s,String t){
        int chars[] = new int[256];
        int chart[] = new int[256];
        for(int i = 0;i < s.length();i++){
            if(chars[s.charAt(i)] != chart[t.charAt(i)]){
                return false;
            }
            chars[s.charAt(i)] = i+1;
            chart[t.charAt(i)] = i+1;
        }
        return true;
    }
    static boolean is_isomorphic1(String s,String t){
        Map<Character,Character> mapst = new HashMap<>();
        Map<Character,Character> mapts = new HashMap<>();
        for(int i = 0;i < s.length();i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if(mapst.containsKey(c1)){
                if(mapst.get(c1) != c2){
                    return false;
                }
            }
            else{
                mapst.put(c1,c2);
            }
            if(mapts.containsKey(c2)){
                if(mapts.get(c2) != c1){
                    return false;
                }
            }
            else{
                mapts.put(c2,c1);
            }
        }
        return true;
    }
}
