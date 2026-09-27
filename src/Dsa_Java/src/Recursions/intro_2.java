package Dsa_Java.src.Recursions;

public class intro_2 {
    public static void main(String[] args){
        int num = 3456;
        String num1 = num + "";
        int len = num1.length();
        System.out.println(rev_str1(num));
        System.out.println(rev_str2(num,len));
        int num2 = 1121;
        String str1 = num2 + "";
        int len2 = str1.length();
        System.out.println(num2 + " is a palindrome statement is " + (num2 == is_palindrome(num2,len2)));
        int num3 = 3034320;
        System.out.println(num3 + " has " + count_zeroes(num3,0) + " zeroes ");
    }
    static int rev_str1(int n){
        int rev = 0;
        while(n > 0){
            int digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;
        }
        return rev;
    }
    static int rev_str2(int n,int len){
        if(n == 0) return 0;
        else return (n%10) * (int)Math.pow(10,len-1) +  rev_str2(n/10,len-1);
    }
    static int power(int expo,int base){
        if(base == 0) return 1;
        else return expo * power(expo,base-1);
    }
    static int is_palindrome(int num,int len){
        if (num == 0 ) return 0;
        else return (num % 10 ) * power(10,len-1) + is_palindrome(num/10,len-1);

    }
    static int count_zeroes(int num,int zeroes){
        num = Math.abs(num);
        if(num <= 9){
                return zeroes;
        }
        else{
            int digit = num % 10;
            if(digit == 0) zeroes++;
        }
        return count_zeroes(num/10,zeroes);
    }
}

