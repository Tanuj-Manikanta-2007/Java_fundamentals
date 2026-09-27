package Dsa_Java.src.Stacks_And_Queues;
import java.util.*;
public class Balancing_Paren {
    public boolean isValid(String s){
        Stack <Character> s1 = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == '(' ||ch ==  '{' ||ch == '[' ){
                s1.push(ch);
            }
            else{
                if(ch == ')'){
                    if(s1.isEmpty() || s1.pop() != '('){
                        return false;
                    }
                }
                if(ch == ']'){
                    if(s1.isEmpty() || s1.pop() != '[' ){
                        return false;
                    }
                }
                if(ch == '}'){
                    if(s1.isEmpty() || s1.pop() != '{') return false;
                }
            }
        }
        return s1.isEmpty();
    }
    public static void main(String[] args){
        Balancing_Paren ex1 = new Balancing_Paren();
        System.out.println(ex1.isValid("[{)}]"));
        System.out.println(ex1.isValid("[{()}]"));
    }
}
