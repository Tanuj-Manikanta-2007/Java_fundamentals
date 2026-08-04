package Stacks_And_Queues;
import java.lang.*;
public class circular_queue {
    private int[] data;
    private static final int  size = 10;
    protected int end = 0;
    protected int front = 0;
    private int length = 0;
    circular_queue(){
        this.data = new int[size];
    }
    circular_queue(int size){
        this.data = new int[size];
    }
    public boolean isFull(){
        return length == data.length;
    }
    public boolean isEmpty(){
        return length == 0;
    }
    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        data[end++] = item;
        end = end % data.length;
        length++;
        return true;
    }
    public int remove() {
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        int removed =  data[front];
        front = front % data.length;
        front++;
        length--;
        return removed;
    }
    public void printqueue(){
        if(isEmpty()){
            System.out.println("Queue is empty ");
        }
        int i = front;
        do{
            System.out.print(data[i] + " ->" );
            i++;
            i %= data.length;
        }
        while(i != end);
        System.out.println("END");
    }
    public static void main(String[] args){
        circular_queue q1 = new circular_queue();
        q1.insert(34);
        q1.insert(24);
        q1.insert(78);
        q1.insert(143);
        q1.insert(139);
        q1.printqueue();
        q1.remove();
        q1.remove();
        q1.printqueue();

    }
}