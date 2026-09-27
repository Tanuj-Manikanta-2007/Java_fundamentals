package Dsa_Java.src.Hashing;
import java.util.*;
public class Exhashmap {
    public static void main(String[] args){
        HashMap<String,Integer> map = new HashMap<>();
        map.put("tanuj",97);
        map.put("ramesh",67);
        map.put("suresh",90);
        map.put("kamesh",56);
        System.out.println(map);
        System.out.println(map.get("tanuj"));
        for(String keys:map.keySet()){
            System.out.println(keys + " --> " +map.get(keys));
        }
        int max = 0;
        int min = 100;
        for(String keys: map.keySet()){

            if(max < map.get(keys)){
                max = map.get(keys);
            }
            if(min > map.get(keys)){
                min = map.get(keys);
            }
        }
        System.out.println(min + "  " + max);
        int[] arr = {1,1,2,4,5,2,3,4};
        HashMap<Integer,Integer> map1 = new HashMap<>();
        for(int i : arr){
            map1.put(i,(map1.getOrDefault(i,0) )+ 1);
        }
        System.out.println(map1);
    }
}
