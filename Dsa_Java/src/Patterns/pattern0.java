package Patterns;

public class pattern0 {
    public static void main(String[] args){
        pattern1(5);
        pattern2(4);
        pattern3(5);
        pattern4(5);
        pattern5(5);
    }
    static void pattern2(int n){
        for(int rows = 1; rows <= n;rows++){
            for(int cols = 1;cols <= rows;cols++){
                System.out.printf("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
    static void pattern1(int n){
        for(int i = 1; i <= n;i++){
            System.out.println("* ".repeat(n));
        }
        System.out.println();
    }
    static void pattern3(int n){
        for(int i = 1;i <= n;i++){
            for(int j = n;j >= i;j--){
                System.out.printf("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
    static void pattern4(int n){
        for(int i = 1;i <= n;i++){
            for(int j  =1; j <= i;j++){
                System.out.printf("%d ",j);
            }
            System.out.println();
        }
        System.out.println();
    }
    static void pattern5(int n){
        for(int i = 0;i <= 2*n;i++){
            int row_num = i > n ? (2 * n) - i : i;
            for(int j = 0;j < row_num;j++) {
                System.out.printf("* ");
            }
            System.out.println();
        }
    }
}
