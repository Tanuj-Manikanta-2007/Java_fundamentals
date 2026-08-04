package striver.stack;
import java.util.*;
public class infix_to_prefix {
    public static void main(String args[]){
        String str = "a+b*(c^d-e)";
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        Map<Character,Integer> map = new HashMap<>();
        map.put('^',3);
        map.put('*',2);
        map.put('/',2);
        map.put('+',1);
        map.put('-',1);
        map.put('(',0);
        map.put(')',0);
        int n = str.length();
        for(int i = n-1;i >= 0;i--){
            char ch = str.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                sb.append(ch);
            }
            else if(ch == ')'){
                stack.push(ch);
            }
            else if(ch == '(') {
                while (!stack.isEmpty() && stack.peek() != ')') {
                    sb.append(stack.pop());
                }
                stack.pop();
            }
            else{
                while(!stack.isEmpty() && map.get(stack.peek()) > map.get(ch)){
                    sb.append(stack.pop());
                }
                stack.push(ch);
            }
        }
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        System.out.println(sb + "    " + sb.reverse());

    }
}
