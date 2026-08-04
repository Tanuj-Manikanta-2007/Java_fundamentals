package Linked_List;
import java.util.*;

public class CircularLL {
    Node head;
    Node last;
    void printlist(){
        if(head == null){
            System.out.println("The List is empty");
            return;
        }
        if(head.next == head){
            System.out.printf("%d -> (back to %d)\n",head.data,head.data);
            return;
        }
        Node temp = head;
        while(temp != last){
            System.out.printf("%d-> ",temp.data);
            temp =temp.next;
        }
        System.out.printf("%d -> (back to %d)\n",last.data,head.data);
    }
    void insert_beg(int value){
        Node newNode = new Node(value);
        if(head == null){
            head = last = newNode;
            last.next = head;
            printlist();
            return;
        }
        newNode.next = head;
        head = newNode;
        last.next = head;
        printlist();
    }
    void insert_end(int value){
        Node newNode = new Node(value);
        if(head == null){
            head = last = newNode;
            newNode.next = head;
            printlist();
            return;
        }
        if(head.next == head){
            last = newNode;
            head.next = newNode;
            newNode.next = head;
            printlist();
            return;
        }
        last.next = newNode;
        last = newNode;
        newNode.next = head;
        printlist();
    }
    void insert_pos(int pos,int value){
        Node newNode = new Node(value);
        if(pos == 1){
            insert_beg(value);
            return;
        }
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        Node temp = head;
        for(int i= 1;i < pos-1 && temp != last;i++){
            temp = temp.next;
        }
        if(temp == null || temp.next == null){
            System.out.println("Invalid position ");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        if(temp == last){
            last = newNode;
        }
        printlist();
    }
    void delete_beg(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        if(head.next == head){
            head = null;
            return;
        }
        head = head.next;
        last.next = head;
        printlist();
    }
    void delete_end(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        if(head.next == head){
            head = null;
            return;
        }
        Node temp = head;
        while(temp.next != last){
            temp = temp.next;
        }
        last = temp;
        printlist();
    }
    void delete_randam(int pos){
        if(pos == 1){
            delete_beg();
            return;
        }
        Node temp = head;
        for(int i = 1; i < pos-1 && temp != null;i++){
            temp = temp.next;
        }
        if(temp == null || temp.next == null){
            System.out.println("Invalid position");
            return;
        }
        if(temp.next == last){
            temp = last;
        }
        temp.next = temp.next.next;
        printlist();

    }
    public static void main(String[] args){
        CircularLL  CLL = new CircularLL();
        CLL.insert_beg(4);
        CLL.insert_end(8);
        CLL.insert_beg(2);
        CLL.insert_end(6);
        CLL.insert_pos(3,5);
        CLL.delete_beg();
        CLL.delete_end();
        CLL.delete_randam(2);
    }
}
