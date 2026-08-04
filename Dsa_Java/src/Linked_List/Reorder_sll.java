package Linked_List;
import java.util.*;
public class Reorder_sll {
    static class ListNode {
        int data;
        ListNode next;

        ListNode(int val) {
            this.data = val;
            this.next = null;
        }
    }

    static ListNode middle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    static ListNode reverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode prev = null;
        ListNode present = head;
        ListNode next = null;
        while (present != null) {
            next = present.next;
            present.next = prev;
            prev = present;
            present = next;
        }
        return prev;
    }

    static void printlist(ListNode head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    static ListNode reorder(ListNode head) {
        ListNode hf = head;
        ListNode mid = middle(head);
        ListNode hs = reverse(mid.next);
        mid.next = null;
        while (hf != null && hs != null) {
            ListNode temp1 = hf.next;
            ListNode temp2 = hs.next;
            hf.next = hs;
            hs.next = temp1;
            hf = temp1;
            hs = temp2;
        }

        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(23);
        head.next = new ListNode(34);
        head.next.next = new ListNode(45);
        head.next.next.next = new ListNode(1);
        head.next.next.next.next = new ListNode(99);

        System.out.println("Original Linked List:");
        printlist(head);

        head = reorder(head);

        System.out.println("Reordered Linked List:");
        printlist(head);
    }
}


