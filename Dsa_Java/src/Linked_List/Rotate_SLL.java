package Linked_List;
import java.util.*;
public class Rotate_SLL {
    static class ListNode{
        int data;
        ListNode next;
        ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    ListNode rotate(ListNode head,int k){
        ListNode temp = head;
        int length = 1;
        while(temp.next != null){
            temp = temp.next;
            length++;
        }
        temp.next = head;
        ListNode temp1 = head;
        k = k % length;
        int times = length-k;
        for(int i= 0; i < times-1;i++){
            temp1 = temp1.next;
        }
        head = temp1.next;
        temp1.next = null;
        return head;
    }
    void printlist(ListNode head){
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args ){
        Rotate_SLL p1 = new Rotate_SLL();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        p1.printlist(head);
        head = p1.rotate(head,3);
        p1.printlist(head);
    }
}
