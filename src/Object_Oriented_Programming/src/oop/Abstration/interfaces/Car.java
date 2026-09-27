package Object_Oriented_Programming.src.oop.Abstration.interfaces;

public class Car implements Break, Engine{
    @Override
    public void Break() {
        System.out.println("I brake like a normal Car");
    }

    @Override
    public void start() {
        System.out.println("I start like a normal Car");
    }

    @Override
    public void stop() {
        System.out.println("I stop like a normal Car");
    }

    @Override
    public void acc() {
        System.out.println("I accelerate like a normal Car");
    }
}
