package oop.Polymorhism;

public class Main {
    public static void main(String[] args){
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();
        Triangle triangle = new Triangle();
        shape.area();
        circle.area();
        triangle.area();
        square.area();
        
    }
}
