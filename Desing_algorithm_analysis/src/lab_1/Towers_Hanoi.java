package lab_1;
import java.util.*;
public class Towers_Hanoi {
    public static void main(String[] args){
        System.out.println("------Order of two ______");
        towers_of_honai(2,'s','i','d');
        System.out.println("------Order of three ______");
        towers_of_honai(3,'s','i','d');
        System.out.println("------Order of four ______");
        towers_of_honai(4,'s','i','d');
    }
    static void towers_of_honai(int n,char s,char i,char d){
        if(n == 1){
            System.out.println(s + " to " + d);
            return;
        }
        towers_of_honai(n-1,s,d,i);
        System.out.println(s + " to " + d);
        towers_of_honai(n-1,i,s,d);
    }
}
