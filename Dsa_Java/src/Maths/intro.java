package Maths;

public class intro {
    public static void main(String[] args){
        int n1 = 89;
        int n2 = 80;
        System.out.println(n1 + " is a " + isOdd(n1) + " and  "  + n2 + isOdd(n2));
        int[] arr1 = {23,45,78,23,45};
        System.out.println("The unique eleemnt is " + ans(arr1));
    }
    static boolean isOdd(int n){
        return (n & 1) == 1;
    }
    static int ans(int[] arr){
        int res = 0;
        for(int n : arr){
            res ^= n;
        }
        return res;
    }
}
// to find the ith bit we have to perform n & (1 << (n-1))
