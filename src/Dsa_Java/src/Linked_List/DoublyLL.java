package Dsa_Java.src.Linked_List;

public class DoublyLL {
    class Nodes{
        int data;
        Nodes next;
        Nodes prev;
        Nodes(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    Nodes last;
    void printlist(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Nodes temp = head;
        while(temp.next != null){
            System.out.printf("%d <-> ",temp.data);
            temp = temp.next;
        }
        last = temp;
        System.out.printf("%d <-> NULL\n",temp.data);
    }
    Nodes head;
    void insert_beg(int value){
        Nodes newnode = new Nodes(value);
        if(head == null){
            head = newnode;
            printlist();
            return;
        }
        newnode.next = head;
        head.prev = newnode;
        head = newnode;
        printlist();
    }
    void insert_end(int value){
        Nodes newnode = new Nodes(value);
        if(head == null){
            head = newnode;
            printlist();
            return;
        }
        last.next = newnode;
        newnode.prev = last;
        last = newnode;
        printlist();
    }
    void insert_pos(int pos,int value){
        Nodes newnode = new Nodes(value);
        if(pos == 1){
            insert_beg(value);
            return;
        }
        Nodes temp = head;
        for(int i =1; i < pos-1 && temp != null;i++){
            temp = temp.next;
        }
        if(temp == null ){
            System.out.println("Invalid position");
            return;
        }
        newnode.next = temp.next;

        newnode.prev = temp;
        if(temp.next != null){
            temp.next.prev = newnode;
        }else{
            last = newnode;
        }
        temp.next = newnode;
        printlist();
    }
    void delete_beg(){
        if(head == null){
            System.out.println("The list is empty");
            return;
        }
        if(head.next == null){
            head = null;
            printlist();
            return;
        }
        head = head.next;
        head.prev = null;
        printlist();
    }
    void delete_end(){
        if(head == null){
            System.out.println("The list is empty");
            return;
        }
        if(head.next == null){
            head = null;
            printlist();
            return;
        }
       Nodes temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        last = temp;
        printlist();
    }
    void delete_pos(int pos){
        if(pos == 1){
            delete_beg();
        }
        if(head == null){
            System.out.println("The list is empty");
            return;
        }
        Nodes temp = head;
        for(int i = 1;i < pos-1 && temp != null;i++){
            temp = temp.next;
        }
        if(temp == null || temp.next == null){
            System.out.println("Invalid position ");
            return;
        }
        temp.next = temp.next.next;
        printlist();
    }
    public static void main(String args[]){
        DoublyLL DLL = new DoublyLL();
        DLL.insert_beg(3);
        DLL.insert_beg(6);
        DLL.delete_end();
        DLL.insert_beg(9);
        DLL.insert_end(12);
        DLL.delete_beg();
        DLL.insert_end(5);
        DLL.delete_pos(2);
        DLL.insert_pos(2,40);
    }
}
