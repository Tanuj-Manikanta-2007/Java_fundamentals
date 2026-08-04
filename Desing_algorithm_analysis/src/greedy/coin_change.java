package greedy;
import java.util.*;
public class coin_change {
    public static void main(String[] args){
        int change[] = {5,10,1};
        int amt = 68;
        int res[] = Coin_Change(change,amt);
        System.out.println("Result max profit by greddy : ");
        int pro = 0;
        for(int i = 0;i < res.length;i++){
            if(res[i] != 0){
                System.out.println(change[i] + " *  " + res[i]);
            }

        }
        System.out.println(Arrays.toString(res));
    }
    static int[] Coin_Change(int d[],int amt){
        int x[] = new int[d.length];
        System.out.println(Arrays.toString(d));
        descending(d);
        System.out.println(Arrays.toString(d));
        for(int i = 0;i < d.length;i++){
            if(amt >= d[i]){
                x[i] = amt/d[i];
                amt = amt - x[i] * d[i];
            }
        }
        return x;
    }
    static void descending(int arr[]){
        Arrays.sort(arr);
        int s = 0;
        int e = arr.length-1;
        while(s < e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }


}
