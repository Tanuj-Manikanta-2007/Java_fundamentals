package striver.basic;
import java.util.*;
public class factors {
    public static void main (String[] args){
        PriorityQueue<Integer> pq=  new PriorityQueue<>((a,b) -> b-a);
        int num = 64;
        for(int i = 2;i * i <= num;i++){
            if(num % i == 0){
                pq.offer(i);
                if(num / i != i){
                    pq.offer(num/i);
                }
            }
        }
        System.out.println(pq);
        while(!pq.isEmpty()){
            System.out.print(pq.poll() + " ");
        }

    }
}
