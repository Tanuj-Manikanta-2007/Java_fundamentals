package striver.stack;
import java.util.*;
public class postfix_to_infix {
    public static void main(String[] args){
        String postfix =  "AB*C+";
        Stack<String> stack = new Stack<>();
        for(char ch : postfix.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                stack.push(ch+"");
            }
            else{
                String op2 = stack.pop();
                String op1 = stack.pop();
                op1 = "(" + op1 + ch + op2 + ")";
                stack.push(op1);
            }
        }
        System.out.println(stack.peek());
    }
}
