package oop.Inheritance;

public class Main {
    public static void main(String[] args){
        Box box1 = new Box();
        Box box2 = new Box(4);
        Box box3 = new Box(1.4,90.6,45.7);
        System.out.println(box1.l + " " + box1.w + " " + box1.h);
        System.out.println(box2.l + " " + box2.w + " " + box2.h);
        System.out.println(box3.l + " " + box3.w + " " + box3.h);

        BoxWeight boxnew = new BoxWeight(23,45,67,89);
        System.out.println(boxnew.h + " " + boxnew.weight);
    }
}
