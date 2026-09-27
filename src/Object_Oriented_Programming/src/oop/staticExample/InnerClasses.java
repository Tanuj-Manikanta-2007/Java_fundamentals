package Object_Oriented_Programming.src.oop.staticExample;

public class InnerClasses {

    static class Test {
        String name;

        public Test(String name) {
            this.name = name;
        }
        @Override
        public String toString() {
            return name;
        }
    }

    void greeting() {
        System.out.println("Hello Orawa Tanuj!");
    }


    public static void main(String[] args) {
        Test a = new Test("Tanuj");
        Test b = new Test("Ganesh");

        System.out.println(a.name);
        System.out.println(b.name);
        InnerClasses obj = new InnerClasses();
        obj.greeting();
        System.out.println(a);
    }
}
