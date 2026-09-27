package Object_Oriented_Programming.src.oop.Abstration.interfaces.nested;

public class A {
    public interface NestedInterface {
        boolean isOdd(int num);
    }
}

class B implements A.NestedInterface{

    @Override
    public boolean isOdd(int num) {
        return (num & 1) == 1;
    }
}
