package Stacks_And_Queues;
import java.util.*;
public class LT_1541 {
    int min_length(String s){
        int i = 0;
        int count = 0;
        int top = 0;
        while(i < s.length()){
            char ch = s.charAt(i);
            if(ch == '('){
                top++;

                i++;
            }
            else{
                if((i+1) < s.length() && s.charAt(i+1) == ')'){
                    i += 2;
                }else{
                    count++;
                    i++;
                }
                if(top > 0 ){
                    top--;
                }else{
                    count++;
                }
            }
        }
        count += top * 2;
        return count;
    }
    public static void main(String[] args){
        LT_1541 q1 = new LT_1541();
        System.out.println(q1.min_length("()))"));

    }
}
