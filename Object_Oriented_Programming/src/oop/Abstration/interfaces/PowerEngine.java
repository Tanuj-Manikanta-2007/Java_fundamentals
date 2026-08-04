package oop.Abstration.interfaces;

public class PowerEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Power engine Start");
    }

    @Override
    public void stop() {
        System.out.println("Power engine Stopped");
    }

    @Override
    public void acc() {
        System.out.println("Power engine acccerlated");
    }
}
