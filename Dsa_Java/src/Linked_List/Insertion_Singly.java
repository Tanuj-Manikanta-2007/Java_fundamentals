package Linked_List;
import java.util.*;
class Node{
    int data;
    Node next;
    Node (int data){
        this.data = data;
        this.next = null;
    }
}
class SinglyLinkedList{
    Node head;
    public void printlist(){
        if(head == null){
            System.out.println("Linked list is empty");
        }
        Node temp = head;
        while(temp != null){
            System.out.printf("%d-> ",temp.data);
            temp = temp.next;
        }
        System.out.printf("null\n");
    }
    public void insertAtFront(int data){
        Node newnode = new Node(data);
        newnode.next = head;
        head = newnode;
        printlist();
    }
    public void insertAtEnd(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            System.out.println("The Given  List is empty");
            printlist();
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newnode;
        printlist();
    }
    public void insertAtPos(int pos,int data){
        Node newnode = new Node(data);
        if(pos == 0){
            System.out.println("Invalid position");
            return;
        }
        if(pos == 1){
            if(head == null){
                head = newnode;
                printlist();
                return;
            }
            newnode.next = head;
            head = newnode;
            printlist();
            return;
        }
        Node temp = head;
        for(int i = 1; i < pos-1 && temp != null ; i++){
            temp = temp.next;
        }
        if(temp == null){
            System.out.println("The index is out off bounch");
        }
        newnode.next = temp.next;
        temp.next = newnode;
        printlist();
    }

    void delete_front(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        if(head.next == null){
            head = null;
            printlist();
            return;
        }
        head = head.next;
        printlist();
    }
    void delete_last(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        if(head.next == null){
            head = null;
            printlist();
            return;
        }
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        printlist();
    }
    void delete_ran(int pos){
        if(pos == 1){
            delete_front();
            return;
        }
        Node temp = head;
        for(int i = 1; i < pos-1 && temp != null;i++){
            temp = temp.next;
        }
        if(temp == null || temp.next == null){
            System.out.println("Invalid postion ");
            return;
        }
        temp.next = temp.next.next;
        printlist();
    }
}
public class Insertion_Singly {
    public static void main(String[] args){
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertAtFront(5);
        list.insertAtEnd(10);
        list.insertAtFront(15);
        list.insertAtEnd(5);
        list.delete_front();
        list.insertAtPos(3,15);
        list.delete_last();
        list.delete_ran(2);
    }
}
