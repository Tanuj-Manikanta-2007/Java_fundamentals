package Dsa_Java.src.Patterns;

public class pattern2 {
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
    static void pattern13(int n){
        for(int i = 1;i <= n;i++){
            for(int j = 1;j <= i;j++){
                System.out.print(j);
            }
            for(int j = 1;j <= 2 * n - (2 * i);j++){
                System.out.print(" ");
            }
            for(int j = i;j >= 1;j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void pattern14(int n){
        int sumn = 0;
        for(int i = 0;i <= n;i++){
            for(int j = 0;j < i;j++){
                sumn++;
                System.out.print(sumn + " ");
            }
            System.out.println();
        }

    }
    static void pattern15(int n){
        for(int i = 0;i < n;i++){
            for(int j = 0;j <= i;j++){
                System.out.print((char)(65+j) + " ");
            }
            System.out.println();
        }
        for(int i = 0;i <= n;i++){
            for(int j = 0;j < n - i;j++){
                System.out.print((char)(65+j)+" ");
            }
            System.out.println();
        }
        for(int i  = 0;i <=n ;i++){
            for(int j = 0;j <= i;j++){
                System.out.print((char)(65+i));
            }
            System.out.println();
        }

    }
    static void pattern16(int n){
        for(int i = 0;i < n;i++){
            for(int j = 0;j < n-i-1;j++){
                System.out.print(" ");
            }
            char alpha = 'A';
            int point = (2 * i +1)/2;
            for(int j = 1;j <= 2 * i +1;j++){
                System.out.print(alpha);
                if(j <= point) {
                    alpha++;
                }else{
                    alpha--;
                }
            }
            for(int j = 0;j < n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void pattern17(int n){
        for(int i  = 0;i < n;i++){
            for(int j = 0;j < n-i;j++){
                System.out.print("*");
            }
            for(int j = 1;j <= i;j++){
                System.out.print(" ");
            }
            for(int j = 1;j <= i;j++){
                System.out.print(" ");
            }
            for(int j = 0;j < n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 0;i < n;i++){
            for(int j = 0;j <= i;j++){
                System.out.print("*");
            }
            for(int j = 0; j < (n-i-1)*2;j++){
                System.out.print(" ");
            }
            for(int j = 0;j <= i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern18(int n){
        for(int i  = 0;i < n;i++){
            for(int j = 0;j <= i;j++){
                System.out.print("*");
            }
            for(int j = 0;j < (n-i-1) * 2;j++){
                System.out.print(" ");
            }
            for(int j = 0;j <= i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 1;i < n;i++){
            for(int j = 0;j < n-i;j++) {
                System.out.print("*");
            }
            for(int j = 0; j < 2 * i;j++){
                System.out.print(" ");
            }
            for(int j = 0;j < n-i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern19(int n){
        for(int i  = 0;i < 2 *n -1;i++ ){
            for(int j = 0;j < 2 *n - 1;j++){
                int top = i;
                int bottom = (2 * n - 2 )- i;
                int left = j;
                int right = (2 * n - 2) - j;
                System.out.print(n - Math.min(Math.min(top,bottom),Math.min(left,right)));
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        System.out.println("////////// Pattern 10 ////////////");
        pattern11(5);
        System.out.println("////////// Pattern 11 ////////////");
        pattern12(5);
        System.out.println("////////// Pattern 12 ////////////");
        pattern13(4);
        System.out.println("////////// Pattern 13 ////////////");
        pattern14(5);
        System.out.println("////////// Pattern 14 ////////////");
        pattern15(5);
        System.out.println("////////// Pattern 15 ////////////");
        pattern16(5);
        System.out.println("////////// Pattern 16 ////////////");
        pattern17(5);
        System.out.println("////////// Pattern 17 ////////////");
        pattern18(5);
        System.out.println("////////// Pattern 18 ////////////");
        pattern19(4);
    }
}
