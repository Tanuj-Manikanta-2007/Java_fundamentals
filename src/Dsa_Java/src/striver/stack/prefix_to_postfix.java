package Dsa_Java.src.striver.stack;
import java.util.*;
public class prefix_to_postfix {
    public static void main(String[] main){
        String prefix = "*-A/BC-/AKL";
        Stack<String> stack = new Stack<>();
        int n = prefix.length() - 1;
        for(int i  = n;i >= 0;i--){
            char ch = prefix.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                stack.push(ch+"");
            }
            else{
                String op1 = stack.pop();
                String op2=  stack.pop();
                op1 = op1 + op2 + ch;
                stack.push(op1);
            }
        }
        System.out.println(stack.pop());
    }
}
