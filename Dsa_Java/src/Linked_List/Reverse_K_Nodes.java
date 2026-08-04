package Linked_List;
import java.util.*;

public class Reverse_K_Nodes {
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

    ListNode reverseKGroup(ListNode front, int k) {
        if (front == null || k <= 1) {
            return front;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = front;

        ListNode prev = dummy;

        while (true) {
            ListNode kth = prev;
            for (int i = 0; i < k && kth != null; i++) {
                kth = kth.next;
            }

            if (kth == null) break;

            ListNode groupstart = prev.next;
            ListNode next = kth.next;

            ListNode present = groupstart;
            ListNode prevnode = next;

            while (present != next) {
                ListNode temp = present.next;
                present.next = prevnode;
                prevnode = present;
                present = temp;
            }

            prev.next = kth;
            prev = groupstart;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        Reverse_K_Nodes obj = new Reverse_K_Nodes();

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = new ListNode(7);
        head.next.next.next.next.next.next.next = new ListNode(8);

        System.out.println("Original list:");
        printlist(head);

        head = obj.reverseKGroup(head, 3);

        System.out.println("Reversed in groups of 3:");
        printlist(head);
    }
}
