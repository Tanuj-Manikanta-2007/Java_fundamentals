package oop.Case_Study;
import java.util.*;
public class Employee_Management_System {
    static ArrayList <List<Object>> Management = new ArrayList<>();
    static class Employee{
        String empId;
        String name;
        int salary;
        Employee(String id,String name,int salary){
            this.empId = id;
            this.name = name;
            this.salary = salary;
            ArrayList <Object> ls = new ArrayList<>();
            ls.add(id);
            ls.add(name);
            ls.add(salary);
            Management.add(ls);
        }
        void displayDetails(){
            System.out.println("Employ ID\t\tName\t\tSalary(INR)\n");
            System.out.println(this.empId + "\t\t" + this.name + "\t\t" + this.salary);
        }
    }
    static class Manager extends Employee{
        String department;
        Manager(String id,String name,int salary,String department){
            super(id,name,salary);
            this.department = department;
            for(List<Object> ls : Management){
                if(ls.get(0).toString().equals(name)){
                    ls.add(this.department);
                }
            }
        }
        void details(){
            System.out.println("Employ ID\t\tName\t\tSalary(INR)\t\tDepartment\n");
            System.out.println(super.empId + "\t\t" + super.name + "\t\t" + super.salary + " belongs to the department " + this.department);
        }
    }
    static class Developer extends Employee{
        String lang;
        Developer(String id,String name,int salary,String lang){
            super(id,name,salary);
            this.lang = lang;
            for(List<Object> ls : Management){
                if(ls.get(0).toString().equals(id)){
                    ls.add(lang);
                }
            }
        }
        void details(){
            System.out.println("EmpId\t\tName\t\tSalary\t\tUses this language");
            System.out.println(super.empId + "\t\t" + super.name + "\t\t" + super.salary + "\t\t and uses the langueage" + this.lang + "for the project");
        }

    }
    static class Intern extends Employee{
        String duration; // duration in string like HH:MM:SS
        String mentorName;
        Intern(String id,String name,int salary,String duration,String mentorName){
            super(id,name,salary);
            this.duration = duration;
            this.mentorName = mentorName;
            for(List<Object> ls : Management){
                if(ls.get(0).toString().equals(id)){
                    ls.add(duration);
                    ls.add(mentorName);
                }
            }
        }
        void display(){
            System.out.println("Employee id \t\tName\t\tSalary\t\tDuration Worked\t\t and his Mentor Name\n");
            System.out.println(super.empId + "\t\t" + super.name + "\t\t" + super.salary + "\t\t" + this.duration + "\t\t" + this.mentorName );
        }
    }
    public static void main(String[] args){
        Employee e1 = new Employee("E101", "Tanuj", 120000);
        Manager m1 = new Manager("M201", "Deepak Sai", 60000, "HR");
        Developer d1 = new Developer("D301", "Sai Ram", 50000, "Java");
        Intern i1 = new Intern("I401", "David", 20000, "3 Months", "Tanuj");

        System.out.println("\n--- Employee Details ---");
        e1.displayDetails();

        System.out.println("\n--- Manager Details ---");
        m1.details();

        System.out.println("\n--- Developer Details ---");
        d1.details();

        System.out.println("\n--- Intern Details ---");
        i1.display();

        System.out.println("\n--- Management ArrayList ---");
        for (List<Object> ls : Management) {
            System.out.println(ls);
        }
    }
}
