package Recursions.String;
import java.util.*;
public class path {
    public static void main(String[] args){
        System.out.println(count(3,3));
        path("",3,3);
        System.out.println(path_arr("",3,3));
        System.out.println(path_dia("",3,3));
    }
    static int count(int r,int c){
        if(r == 1 || c == 1){
            return 1;
        }
        int left = count(r-1,c);
        int right = count(r,c-1);
        return left+right;
    }
    static void path(String p,int r,int c){
        if(r == 1 && c == 1){
            System.out.println(p);
            return;
        }
        if(r > 1){
            path(p + 'R', r- 1,c);
        }
        if(c > 1){
            path(p + 'D',r,c-1);
        }
    }
    static ArrayList<String> path_arr(String p,int r,int c){
        ArrayList<String> outer = new ArrayList<>();
        if(r == 1 && c== 1){
            outer.add(p);
        }
        if(r > 1){
            outer.addAll(path_arr(p + 'R',r-1,c));
        }
        if(c > 1){
            outer.addAll(path_arr(p + 'D',r,c-1));
        }
        return outer;
    }
    static ArrayList<String> path_dia(String p,int r,int c){
        ArrayList<String> outer = new ArrayList<>();
        if(r == 1 && c== 1){
            outer.add(p);
        }
        if(r > 1){
            outer.addAll(path_dia(p + 'V',r-1,c));
        }
        if(c > 1){
            outer.addAll(path_dia(p + 'H',r,c-1));
        }
        if(r > 1 && c > 1){
            outer.addAll(path_dia(p + 'D',r-1,c-1));
        }
        return outer;
    }
}
