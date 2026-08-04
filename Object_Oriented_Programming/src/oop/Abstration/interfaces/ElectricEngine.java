package oop.Abstration.interfaces;

public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Elecertic engine started");
    }

    @Override
    public void stop() {
        System.out.println("Elecertic engine stopped");
    }

    @Override
    public void acc() {
        System.out.println("Elecertic engine accerlate");
    }
}
