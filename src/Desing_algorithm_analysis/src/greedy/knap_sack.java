package Desing_algorithm_analysis.src.greedy;
import java.util.*;
public class knap_sack {
    public static void main(String[] args){
        int p[] = {77, 40, 45, 22, 90};
        int w[] = {5, 10, 15, 3, 40};
        for(int i = 0; i < p.length;i++){
            int max = i;
            for(int j = i+1;j < w.length;j++){
                if((double)p[j]/w[j] > (double)p[max]/w[max]){
                    max = j;
                }
            }
            swap(p,i,max);
            swap(w,i,max);
        }
        System.out.println(Arrays.toString(p) + "  " + Arrays.toString(w));
        int margin = 60;
        float res[] = Knap_Snack(p,w,margin);
        double profit = 0;
        for(int i = 0;i < res.length;i++){
            profit +=   w[i] * res[i];
        }
        System.out.println("Max profit : " + profit);
    }
    static void swap(int arr[],int s,int e){
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }

    static float[] Knap_Snack(int p[],int w[],int margin){
        float x[] = new float[p.length];
        for(int i = 0;i < p.length;i++){
            if(w[i] <= margin){
                x[i] = 1;
                margin -= w[i];
            }
            else{
                x[i] = (float)margin/w[i];
                break;
            }
        }
        System.out.println(Arrays.toString(x));
        return x;

    }
}
