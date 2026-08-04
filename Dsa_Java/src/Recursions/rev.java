package Recursions;

public class rev {
    public static void main(String[] args){
        fun(5);
        System.out.println();
        rev_fun(5);
        fun_both(5);
        System.out.println(factorial(5));
        System.out.println(sum_n(5));
        System.out.println(power(2,3));
        System.out.println(sum_digit(45));
        int num  = 345;
        String n1 = num + "";
        int len = n1.length();
        System.out.println(rev_digit(num,len));

    }
    static void fun(int n){
        if(n == 1){
            System.out.println(1);
        }
        else{
            System.out.print(n + " ");
            fun(n-1);
        }
    }
    static void rev_fun(int n){
        if(n == 1) System.out.print(1 + " ");
        else{
            rev_fun(n-1);
            System.out.print(n + " ");
        }

    }
    static void fun_both(int n){
        if(n == 1) System.out.println(1 + " ");
        else{
            System.out.println(n);
            fun_both(n-1);
            System.out.println(n);
        }

    }
    static int factorial(int n){
        if (n == 1) return 1;
        else return n * factorial(n-1);
    }
    static int sum_n(int n){
        if (n == 1) return 1;
        else return n + sum_n(n-1);
    }
    static int power(int e,int x){
        if (x == 0) return 1;
        else return e * power(e,x-1);
    }
    static int sum_digit(int n){
        // n = Math.abs(n); handles the negative number
        if (n >= 1 && n <= 9 )return n;
        else{
            return n % 10 + sum_digit(n/10);
        }
    }
    static int rev_digit(int n,int len){
        if(n == 0) return 0;
        else return (n % 10) * power(10,len-1) + rev_digit(n/10,len-1);

    }
}
