package String.Basic;
import java.util.*;
public class remove_1st_last_braket {
    public static void main(String[] args){
        System.out.println(remove_chars("(()())(())"));
    }
    static String remove_chars(String str){
        int ind = 0;
        StringBuilder sb = new StringBuilder();
        for(char ch : str.toCharArray()){
            if(ch == '('){
                if(ind > 0){
                    sb.append(ch);
                }
                ind++;
            }
            if(ch == ')'){
                ind--;
                if(ind > 0){
                    sb.append(ch);
                }
            }
        }
        return sb.toString();
    }
}
