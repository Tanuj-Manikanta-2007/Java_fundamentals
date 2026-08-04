package oop.staticExample;

public class Main {
    public static void main(String[] args){
        Human tanuj = new Human(17,"Tanuj",0,false);
        Human punju = new Human(25,"Raju",100000,true);
        System.out.println(tanuj.name + " " + tanuj.population);
        System.out.println(punju.name + " " + punju.population);
        greeting();
    }
    static void greeting(){
        System.out.println("Hi");
        fun();
    }
    static void fun(){
        Main obj = new Main();
        obj.greetings(); // to access a non static we have to create na object
    }
    void greetings(){
        System.out.println("Anna Namstey !! ");
    }
}

