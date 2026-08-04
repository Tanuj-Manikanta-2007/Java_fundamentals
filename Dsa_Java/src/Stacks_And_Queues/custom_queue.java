package Stacks_And_Queues;
import java.lang.*;
public class custom_queue {
    private int[] data;
    private static final int size = 10;
    int end = -1;
    custom_queue(){
        this(size);
    }
    custom_queue(int size){
        this.data = new int[size];
    }

    public boolean isFull(){
        return end == data.length;
    }
    public boolean isEmpty(){
        return end == 0;
    }
    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        data[++end] = item;
        return true;
    }
    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        int removed = data[0];
        for(int i= 1; i < data.length;i++){
            data[i-1] = data[i];
        }
        end--;
        return removed;
    }
    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        return data[0];
    }
    public void printqueue(){
        for(int i = 0; i < data.length;i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        custom_queue q1 = new custom_queue();
        q1.insert(12);
        q1.insert(23);
        q1.insert(66);
        q1.insert(20);
        q1.insert(7);
        q1.printqueue();
        try{
            q1.remove();
        }
        catch(Exception e){
            System.out.println(e);
        }
        q1.printqueue();
    }
}
