package Object_Oriented_Programming.src.oop.staticExample;

public class staticBlock {
    static int a = 4;
    static int b;
    static {
        System.out.println("I am in Static Block"); // only runs one times.
        b = a*5;
        a++;
    }
    public static void main(String[] args){
        staticBlock obj = new staticBlock();
        System.out.println("a : " + obj.a + " , b : " + obj.b);
        obj.b += 3;
        System.out.println("a : " + obj.a + " , b : " + obj.b);
        staticBlock obj1 = new staticBlock();
        System.out.println("a : "+obj1.a + " , b : " + obj1.b);
    }
}
