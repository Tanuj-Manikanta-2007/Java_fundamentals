package Dsa_Java.src.striver.stack.monotonic_stack;
import java.util.*;
public class next_greater {
    public static void main(String[] args){
        int arr[] = {4,5,2,10};
        System.out.println("Original Array " + Arrays.toString(arr));
        Stack<Integer> stack = new Stack<>();
        int res[] = new int[arr.length];
        for(int i = arr.length-1;i >= 0;i--){
            int num = arr[i];
            while(!stack.isEmpty() && stack.peek() <= num){
                stack.pop();
            }
            if(stack.isEmpty()){
                res[i] = -1;
            }
            else{
                res[i] = stack.peek();
            }
            stack.push(num);
        }
        System.out.println("The next right greater elements " + Arrays.toString(res));
        while(!stack.isEmpty()){
            stack.pop();
        }
        for(int i  = arr.length-1;i >= 0;i--){
            int num=  arr[i];
            while(!stack.isEmpty() && stack.peek() >= num){
                stack.pop();
            }
            if(stack.isEmpty()){
                res[i] = -1;
            }
            else{
                res[i] = stack.peek();
            }
            stack.push(num);
        }
        System.out.println("The next right lesser elements " + Arrays.toString(res));

    }
}
