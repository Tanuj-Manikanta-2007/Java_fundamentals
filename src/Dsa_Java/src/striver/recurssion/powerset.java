package Dsa_Java.src.striver.recurssion;
import java.util.*;
public class powerset {
    public static void main(String[] args){
        String str = "abc";
        int n = str.length();
        int res = 1 << n;
        ArrayList<ArrayList<String>> list = new ArrayList<>();
        for(int ex = 0;ex < res;ex++){
            ArrayList<String> cur = new ArrayList<>();
            StringBuilder sb = new StringBuilder();
            for(int i = 0;i < n;i++){
                if((ex & (1 << i)) != 0){
                    sb.append(str.charAt(i));
                }
            }
            cur.add(sb.toString());
            list.add(cur);
        }
        for(ArrayList<String> sub : list ){
            System.out.println(sub.toString());
        }
    }
}
