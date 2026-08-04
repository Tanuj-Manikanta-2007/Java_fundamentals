package lab_1;
import java.util.*;
public class binary_search {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = {-9,0,12,23,45,67,78,99};
        if(arr_sorted(arr,0)){
            System.out.println("Array is sorted : " + Arrays.toString(arr));
            System.out.println("Enter the key");
            int key = sc.nextInt();
            if(binary_search(arr,0,arr.length-1,key) != -1){
                System.out.println("Element " + key + " is present at " + binary_search(arr,0,arr.length-1,key) + " th index");
            }
            else{
                System.out.println("Element is not present in the array" + " key == " + key + " " + Arrays.toString(arr));
            }
        }
        else{
            System.out.println(Arrays.toString(arr) + " is not sorted");
        }
    }
    static boolean arr_sorted(int arr[],int n){
        if(n == arr.length-1){
            return true;
        }
        if(arr[n] > arr[n+1]) return false;
        else{
            return arr_sorted(arr,n+1);
        }
    }
    static int binary_search(int arr[],int s,int e,int key){
        if(s > e){
            return -1;
        }
        int mid= s + (e-s)/2;
        if(arr[mid] == key) return mid;
        if(key < arr[mid]){
            return binary_search(arr,s,mid-1,key);
        }
        else{
        return binary_search(arr,mid+1,e,key);
        }

    }
}
