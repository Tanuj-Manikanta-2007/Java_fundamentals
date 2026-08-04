package oop;
import java.util.*;
public class Constructor {
    public static void main(String[] args){

        area type1 = new area(5,"Square");
        area type2 = new area();
        area type3 = new area(10,5,2,"Rectangle");
        type1.display();
        type2.display();
        type3.display();
    }
}
class area{
    double area;
    String name;
    area(int side,String name){
        this.area = side*side;
        this.name = name;
    }
    area(){
        this.name = "It is dot";
    }
    area(int len,int hei,int wid,String name){
        this.area=  len*hei*wid;
        this.name = "Rectangle";
    }

    void display(){
        System.out.println("Area of " + name + " is "+ area);
    }
}
