package striver.stack;
import java.util.*;
public class postfix_to_prefix {
    public static void main(String[] main){
        String postfix = "ABC/-AK/L-*";
        Stack<String> stack = new Stack<>();
        for(char ch : postfix.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                stack.push(ch + "");
            }
            else{
                String op1 = stack.pop();
                String op2 = stack.pop();
                op1 = ch + op2 + op1;
                stack.push(op1);
            }
        }
        System.out.println(stack.peek());
    }
}
