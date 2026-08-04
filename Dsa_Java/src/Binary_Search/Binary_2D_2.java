package Binary_Search;
import java.util.*;
public class Binary_2D_2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Rows : ");
        int rows = in.nextInt();
        System.out.println("Coluimns : ");
        int columns = in.nextInt();
        int[][] arr = new int[rows][columns];
        for(int i = 0;i< rows;i++){
            for(int j = 0;j<columns;j++){
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println("key : ");
        int key = in.nextInt();
        int start = 0;
        int end = rows*columns-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            int row = mid/columns;
            int col = mid%columns;
            if(arr[row][col] == key){
                System.out.println("Rows : "+ row + " Columns : " + col);
            }
            if (arr[row][col] < key){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
    }
}
