package Desing_algorithm_analysis.src.lab_1;
import java.util.*;
public class factors {
    public static void main(String[] args){
        int num = 64;
        factors(num);
        factors_loop(num);
        factors_by_prime_factor(num);
    }
    static void factors_loop(int num){
        int count = 0;
        int i;
        for(i = 1; i * i < num;i++){

            if(num % i == 0) count +=2;
        }
        if(num % i == 0) count +=1;
        System.out.println("number of factors " + " of number " + num + " are " + (count));
    }
    static void factors(int num){
        int count1 = 0;
        for(int i = 1;i <= num;i++){
            if(num % i == 0){
                count1 += 1;
                System.out.print(i + " ");
            }
        }
        System.out.println("Number of factors " + count1);
    }
    static void factors_by_prime_factor(int num){
        int i = 2;
        int temp = num;
        int count = 1;
        while(i * i <= num){
            int pi = 0;
            while(num % i == 0){
                pi += 1;
                num /= i;
            }
            count *= (pi + 1);
            i += 1;
        }
        if(num != 1) count *= 2;
        System.out.println(temp + " has " + count + " factors ");
    }
}
