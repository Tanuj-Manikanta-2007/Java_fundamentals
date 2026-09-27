package Desing_algorithm_analysis.src.dynamic_programming;
import java.util.*;


public class nqueens {
    public static void main(String[] args){
        int n = 4;
        int board[][] = new int[n][n];
        if(n_queens(board,0)){
            for(int arr[] : board){
                for(int num : arr){
                    System.out.print(num + "  ");
                }
                System.out.println();
            }
        }
    }
    static boolean n_queens(int board[][],int col){
        int n = board.length;
        if(col >= n){
            return true;
        }
        for(int i  = 0;i < n;i++){
            if(is_valid(board,i,col)){
                board[i][col] = 1;
                if(n_queens(board,col+1)){
                    return true;
                }
                board[i][col] = 0;
            }
        }
        return false;
    }
    static boolean is_valid(int[][] board,int row,int col){
        for(int i  = 0;i < col;i++){
            if(board[row][i] == 1) return false;
        }
        int i = row;
        int j = col;
        while(i >= 0 && j >= 0){
            if(board[i][j] == 1){
                return false;
            }
            i--;
            j--;
        }
        int k = row;
        int m = col;
        while(m >= 0 && k < board.length){
            if(board[k][m] == 1){
                
            }
            m--;
            k++;
        }
        return true;
    }
}
