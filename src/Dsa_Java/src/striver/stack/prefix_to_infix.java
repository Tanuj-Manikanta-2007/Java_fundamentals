package Dsa_Java.src.striver.stack;
import java.util.*;
public class prefix_to_infix {
    public static void main(String[] args){
        String prefix = "*-A/BC-/AKL";
        int n = prefix.length()-1;
        Stack<String> stack = new Stack<>();
        for(int i = n;i >= 0;i--){
            char ch = prefix.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                stack.push(ch + "");
            }
            else{
                String op1 = stack.pop();
                String op2 = stack.pop();
                op1 = "(" + op1 + ch + op2 + ")";
                stack.push(op1);
            }
        }
        System.out.println(stack.peek());
    }
}
