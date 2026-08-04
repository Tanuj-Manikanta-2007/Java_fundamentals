package Patterns;
import java.util.*;
public class pattern1 {
    static void pattern2(int n){
        for(int i = 0; i < n;i++){
            for (int j = 0;j < n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for(int i = 0;i < n;i++){
            for(int j = 0;j <= i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        for(int i = 1;i <= n;i++){
            for(int j = 1;j <= i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        for(int i = 1;i <= n;i++){
            for(int j = 1;j <= i;j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    static void pattern6(int n){
        for(int i = 0;i < n;i++){
            for(int j = 0;j <= n - i-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern7(int n){
        for(int i = 1;i <= n;i++){
            for(int j = 1;j <= n - i+1;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    static void pattern8(int n){
        for(int i = 0;i < n;i++){
            for(int j = 0;j < n-i;j++){
                System.out.print(" ");
            }
            for(int j = 2 * i + 1;j >= 1 ;j--){
                System.out.print("*");
            }
            for(int j = 0; j < n - i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void pattern9(int n){
        for(int i = 0;i < n;i++){
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for(int j = 2 * n - (2 * i + 1);j >= 1;j--) {
                System.out.print("*");
            }
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void pattern11(int n){
        for(int i = 0;i < n;i++){
            for(int j  = 0; j <= i;j++){
                System.out.print("*");
            }
            for(int j = 0;j < n-i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i = 1;i < n;i++){
            for(int j = 0;j < n-i;j++){
                System.out.print("*");
            }
            for(int j = 0;j < n;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void pattern12(int n){
        for(int i  = 0;i < n;i++){
            for(int j = 0; j <= i;j++){
                if((i & 1) == 1){
                    if((j & 1) ==1) System.out.print(1 + " ");
                    else System.out.print(0+ " ");
                }
                else{
                    if((j & 1) ==1) System.out.print(0 + " ");
                    else System.out.print(1+ " ");
                }
            }
            System.out.println();
        }
    }
    static void pattern10(int n){
        for(int i = 0;i < n;i++){
            for(int j = 0; j < n-i-1;j++){
                System.out.print(" ");
            }
            for(int j = 2 * i +1;j >= 1;j--){
                System.out.print("*");
            }
            for(int j = 0; j < n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i  = 0;i < n;i++){
            for(int j = 0;j < i;j++){
                System.out.print(" ");
            }
            for(int j = 2 * n - (2 * i +1);j >= 1;j--){
                System.out.print("*");
            }
            for(int j =0;j < i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        System.out.println("////////// Pattern 1 ////////////");
        pattern2(5);
        System.out.println("////////// Pattern 2 ////////////");
        pattern3(5);
        System.out.println("////////// Pattern 3 ////////////");
        pattern4(5);
        System.out.println("////////// Pattern 4 ////////////");
        pattern5(5);
        System.out.println("////////// Pattern 5 ////////////");
        pattern6(5);
        System.out.println("////////// Pattern 6 ////////////");
        pattern7(5);
        System.out.println("////////// Pattern 7 ////////////");
        pattern8(5);
        System.out.println("////////// Pattern 8 ////////////");
        pattern9(5);
        System.out.println("////////// Pattern 9 ////////////");
        pattern10(5);

    }
}
