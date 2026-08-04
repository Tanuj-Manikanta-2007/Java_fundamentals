package oop.Abstration.interfaces;

public class CDPlayer implements Media{
    @Override
    public void Start() {
        System.out.println("Music Started");
    }

    @Override
    public void End() {
        System.out.println("Music Stopped");
    }
}
