package Linked_List;

public class insert_rec_pos {
    Node head,last;
    void printlist(){
        if(head == null){
            System.out.println("The link list is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.printf("%d-> ",temp.data);
            last = temp;
            temp = temp.next;
        }
        System.out.printf("null\n");
    }
    void insertion(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = last = newnode;
            printlist();
            return;
        }
        last.next = newnode;
        last = newnode;
        printlist();
    }

    Node insert_pos(Node head,int pos,int value){
        if(pos == 1){
            Node newnode = new Node(value);
            newnode.next = head;
            return newnode;
        }
        if(head == null) return null;
        head.next = insert_pos(head.next,pos-1,value);
        return head;
    }
    void addOne(Node head){
        int num = 0;
        Node temp = head;
        Node prevt = null;
        while(temp != null){
            num = num * 10 + temp.data;
            temp = temp.next;
        }
        num = num+1;
        temp = head;
        int n;
        while(num > 0){
            if(temp == null) {
                break;
            }
            n = num % 10;
            temp.data = n;
            num = num/10;
            prevt = temp;
            temp = temp.next;
        }
        if(num > 0){
            prevt.next = new Node(num);
        }
        Node prev = null;
        Node cur = head;
        Node next;
        while(cur != null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        while(prev != null){
            System.out.print(prev.data + " -> ");
            prev = prev.next;
        }
        System.out.print("null");
    }
    public static void main(String[] args){
        insert_rec_pos SLL = new insert_rec_pos();
        SLL.insertion(9);
        SLL.insertion(9);
        SLL.insertion(9);
        SLL.insert_pos(SLL.head,2,9);
        SLL.printlist();
        SLL.addOne(SLL.head);

    }
}
