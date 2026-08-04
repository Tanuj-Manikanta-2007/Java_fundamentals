package Binary_Search.one_d_binary_search;

public class floor_ceil {
    public static  void main(String[] args){
        int arr[] = {2,4,5,6,8,10};
        floor_ceil(arr,7);
        floor_ceil(arr,9);
    }
    static void floor_ceil(int arr[],int key){
        System.out.println(floor(arr,key));
        System.out.println(ceil(arr,key));
    }
    static int floor(int arr[],int key){
        int s = 0;
        int e = arr.length-1;
        int ans = -1;
        while(s <= e){
            int mid = s + (e-s)/2;
            if(arr[mid] <= key ){
                ans = arr[mid];
                s = mid+1;
            }
            else{
                e = mid-1;
            }
        }
        return ans;
    }
    static int ceil(int arr[],int key){
        int s = 0;
        int e = arr.length-1;
        int ans = -1;
        while(s <= e){
            int mid = s + (e-s)/2;
            if(arr[mid] >= key){
                ans = arr[mid];
                e = mid-1;
            }
            else{
                s = mid+1;
            }
        }
        return ans;
    }
}
