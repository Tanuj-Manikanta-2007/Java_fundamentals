package Dsa_Java.src.Stacks_And_Queues;
import java.util.*;
public class Balancing_para_addMin {
    public int addMin(String s){
        Stack <Character> s1 = new Stack <>();
        for(char ch : s.toCharArray()){
            if(ch == '('){
                s1.push(ch);
            }else if(ch == ')'){
                if(!s1.isEmpty() && s1.peek() == '('){
                    s1.pop();
                }
                else{
                    s1.push(ch);
                }
            }
        }
        return s1.size();
    }

    public static void main(String[] args){
        Balancing_para_addMin b1 = new Balancing_para_addMin();
        System.out.println(b1.addMin(")))"));
        
    }
}
