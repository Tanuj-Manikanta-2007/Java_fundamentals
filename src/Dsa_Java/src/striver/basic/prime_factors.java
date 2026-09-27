package Dsa_Java.src.striver.basic;
import java.util.*;
public class prime_factors {
    public static void main(String[] args){
        int num1=  780;
        int num2 = 37;
        prime_factor(780);
        prime_factor(37);
    }
    static void prime_factor(int num){
        if(is_prime(num)){
            System.out.print(num + " ");
            return;
        }
        for(int i = 2;i * i <= num;i++){
            if(num % i == 0){
                System.out.print(i + " ");
                while(num % i == 0){
                    num /= i;
                }
            }
        }
        if(num > 1){
            System.out.println(num);
        }
    }
    static boolean is_prime(int num){
        for(int i = 2;i *i <= num;i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
