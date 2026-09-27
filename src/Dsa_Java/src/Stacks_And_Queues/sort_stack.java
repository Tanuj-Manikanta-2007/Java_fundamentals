package Dsa_Java.src.Stacks_And_Queues;
import java.util.*;
public class sort_stack {
    static void insert_val(Stack<Integer> stack,int val){
        if(stack.isEmpty() || stack.peek() <= val){
            stack.push(val);
            return;
        }
        int temp = stack.pop();

        insert_val(stack,val);
        stack.push(temp);
    }
    static void Sort_Stack(Stack<Integer> stack){
        if(stack.isEmpty() ){
            return;
        }
        int val = stack.pop();
        Sort_Stack(stack);
        insert_val(stack,val);
    }
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        stack.push(12);
        stack.push(3);
        stack.push(-3);
        stack.push(15);
        stack.push(0);
        Sort_Stack(stack);
        while(!stack.isEmpty()){
            System.out.println(stack.pop() + " ");
        }
    }
}
