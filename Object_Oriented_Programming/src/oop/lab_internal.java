package oop;
import java.util.*;

public class lab_internal {

    public static void main(String[] args){
        Employee e1 = new Employee("ganesh",14,235645,"reddy colony",800000,"cse","Research and delopment");
        e1.printsalary();
    }
}
class Member{
    String name;
    int age;
    int phone;
    String address;
    int salary;
    Member(String n,int age,int p,String add,int sal){
        this.name = n;
        this.age = age;
        this.address = add;
        this.salary = sal;
    }
    void printsalary(){
        System.out.println(name + " has salary " + salary);
    }
}
class Employee extends Member{
    String specific;
    String department;
    Employee(String n,int age,int phone,String add,int sal,String spe,String department){
        super(n,age,phone,add,sal);
        this.specific = spe;
        this.department = department;
    }
}
class Manager extends Member{
    String specific;
    String department;
    Manager(String n,int age,int phone,String add,int sal,String spe,String department){
        super(n,age,phone,add,sal);
        this.specific = spe;
        this.department = department;
    }
}
