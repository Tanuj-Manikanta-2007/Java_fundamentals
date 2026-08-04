package lab2;
import java.util.*;
public class string_rev_data_structure {
    public static void main(String[] args){
        Stack<Character> org = new Stack<>();
        Stack<Character> rev = new Stack<>();
        String str1 = "tanuj";
        int i = 0;
        while(i < str1.length()){
            org.push(str1.charAt(str1.length()-i-1));
            rev.push(str1.charAt(i));
            i += 1;
        }
        while(!org.isEmpty()){
            System.out.print(org.pop() + " ");
        }
        System.out.println();
        while(!rev.isEmpty()){
            System.out.print(rev.pop() + " ");
        }
        System.out.println();
    }
}
