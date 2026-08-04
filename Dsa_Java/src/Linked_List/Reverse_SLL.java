package Linked_List;
import java.util.*;
public class Reverse_SLL {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int data){
            this.val = data;
            this.next = null;
        }
    }
    void printlist(ListNode head){
        while(head != null){
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
    ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode present = head;
        ListNode next = null;
        while(present != null){
            next = present.next;
            present.next = prev;
            prev = present;
            present = next;
        }
        return prev;
    }
    public static void main(String[] args){
        Reverse_SLL p1 = new Reverse_SLL();
        ListNode head = new ListNode(23);
        head.next = new ListNode(34);
        head.next.next = new ListNode(12);
        head.next.next.next = new ListNode(1);
        System.out.println("The Linked list : ");
        p1.printlist(head);
        System.out.println("Reversed List : ");
        ListNode front = p1.reverseList(head);
        p1.printlist(front);
    }
}
