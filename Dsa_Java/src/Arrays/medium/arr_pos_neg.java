package Arrays.medium;
import java.util.*;
public class arr_pos_neg {
    public static void main(String args[]){
        int arr[] = {1,2,-3,-1,-2,-3,4,5,7,8,-3};
        int n = arr.length;
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer>  neg = new ArrayList<>();
        for(int num : arr){
            if(num < 0) {
                neg.add(num);
            }
            else pos.add(num);
        }
        int k = 0;
        int i = 0;
        int j = 0;
        while(i < pos.size() && j < neg.size()){
            if(k % 2 == 0) arr[k++] = pos.get(i++);
            else arr[k++] = neg.get(j++);
        }
        while(i < pos.size()){
            arr[k++] = pos.get(i++);
        }
        while(j < neg.size()) {
            arr[k++] = neg.get(j++);
        }
        System.out.println(Arrays.toString(arr));
    }

}
