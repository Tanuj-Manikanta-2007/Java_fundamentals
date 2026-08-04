package lab_1;
import java.util.*;
public class gcd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int result;
        if(num1 > num2){
            result = GCD(num1,num2);
        }else{
            result = GCD(num2,num1);
        }
        System.out.println("GCD of " + num1 + " & " + num2 + " =  " + result + "\n Lcm is " + (num1*num2)/result);
    }
    static int GCD(int num1,int num2){
        if(num2 == 0){
            return num1;
        }
        return GCD(num2,num1%num2);
    }
}
