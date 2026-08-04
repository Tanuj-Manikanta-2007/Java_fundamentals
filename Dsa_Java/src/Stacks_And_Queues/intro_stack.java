package Stacks_And_Queues;
import java.util.*;
public class intro_stack {
    protected int[] data;
    private static final int DEFUALT_SIZE = 10;
    public intro_stack(){
        this(DEFUALT_SIZE);
    }
    public intro_stack(int size){
        this.data = new int[size];
    }
    public static void main(String[] args){
        System.out.println("---Stacks---");
        Stack<Integer> s1 = new Stack<>();
        s1.push(23);
        s1.push(34);
        s1.push(45);
        System.out.println(s1);
        s1.pop();
        System.out.println(s1 + " Stacks First in Last out [FILO]");
        System.out.println("---Queue---");
        Queue <Character> q1 = new LinkedList<>();
        q1.add('C');
        q1.add('H');
        q1.add('A');
        q1.add('R');
        System.out.println(q1);
        q1.remove();
        System.out.println(q1 + " Queues First in First out [FIFO]");
        System.out.println("__Dequeue__ at least time complexicity");
    }
}
