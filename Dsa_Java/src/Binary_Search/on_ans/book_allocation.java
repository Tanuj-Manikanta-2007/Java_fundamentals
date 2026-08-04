package Binary_Search.on_ans;
import java.util.*;
//Problem Statement: Given an array ‘arr of integer numbers, ‘ar[i]’ represents
// number of pages in the ‘i-th’ book. There are a ‘m’ number of students, and
// the task is to allocate all the books to the students.
//Allocate books in such a way that:
//
//Each student gets at least one book.
//Each book should be allocated to only one student.
//Book allocation should be in a contiguous manner.
//You have to allocate the book to ‘m’ students such that the maximum
// number of pages assigned to a student is minimum.
// If the allocation of books is not possible. return -1

//Example 1:
//
//Input Format: n = 4, m = 2, arr[] = {12, 34, 67, 90}
//Result: 113
//Explanation: The allocation of books will be 12, 34, 67 | 90.
// One student will get the first 3 books and the other will get
// the last one.
public class book_allocation {
    public static void main(String[] args){
        int arr[] = {12, 34, 67, 90};
        int m = 2;
        System.out.println(allocation_books(arr,m));
    }
    static int allocation_books(int arr[],int per){
        int max = Integer.MIN_VALUE;
        int sumn = 0;
        for(int num : arr){
            sumn += num;
            if(num > max){
                max = num;
            }
        }
        int low = max;
        int high = sumn;
        int ans = -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(possible(arr,mid,per)){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;

    }
    static boolean possible(int arr[],int limit,int per){
        int count = 1;
        int pages = 0;
        for(int num : arr){
            if(pages + num <= limit){
                pages += num;
            }
            else{
                count++;
                pages = num;
            }
        }
        return count <= per;
    }
}
