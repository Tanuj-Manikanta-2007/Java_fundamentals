package Object_Oriented_Programming.src.oop;
import java.util.*;
public class intro {
    public static void main(String[] args) {
        System.out.println("Welcome to Object Oriented Programming");
//        //store 5 roll nos
//        int[] number = new int[5];
//        //store 5 name
//        String[] names = new String[5];
//        //data of 5 students : {roll no, name, marks}
//        int[] rno = new int[5];
//        String[] name = new String[5];
//        float[] marks = new float[5];

        Student[] students = new Student[5];

        Student tanuj = new Student();
        Student manikanta = new Student(2024175100,"Mainkanta",89.4f);
        System.out.println(tanuj.name);
        System.out.println(tanuj.rno + (float)(tanuj.rno));
        System.out.println(tanuj.marks);
        System.out.println(Arrays.toString(students));
        manikanta.changename("Navdeep");
        manikanta.greeting();
        Student random = new Student (0,"none",100.99f);
        Student random2 = new Student(random);
        System.out.println(random2.marks);
    }
}
class Student {
    int rno;
    String name;
    float marks;

    Student (int roll,String name,float mark) { // works then three arguments are passed
        this.rno =roll;
        this.name =name;
        this.marks =mark;
    }
    void greeting(){
        System.out.println("Hello "+ this.name);
    }
    void changename(String sname){
        this.name = sname;
    }
    Student (){
        this.rno = 20241745;
        this.name = "Random"; // works then no argument is passed
        this.marks = 90.34f;
        //this(13,"random",90.56f);
    }
    Student (Student other){
        this.name = other.name;
        this.rno = other.rno; // we can pass another class as argument
        this.marks = other.marks;
    }
}