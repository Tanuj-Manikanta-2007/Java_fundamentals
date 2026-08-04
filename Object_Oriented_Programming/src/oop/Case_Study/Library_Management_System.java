package oop.Case_Study;
import java.util.*;

public class Library_Management_System {
    static ArrayList <List<Object>> Library = new ArrayList<>();
    static void Library_book() {
        System.out.println("Library Contents:");
        for (List<Object> ls : Library) {
            for (Object obj : ls) {
                System.out.print(obj + "\t");
            }
            System.out.println();
        }
    }
     static class LibraryResource{
        String title;
        String author;
        int year;
        LibraryResource(String book,String author,int year){
            List<Object> ls1 = new ArrayList<>();
            this.title = book;
            this.author = author;
            this.year = year;
            ls1.add(book);
            ls1.add(author);
            ls1.add(year);
            Library.add(ls1);
        }
        void displayDetails(){
            System.out.println("Title\tAuthor\tYear of Publication");
            System.out.println(this.title+ "\t" + this.author + "\t" + this.year + "\n" );
        }
     static class Book extends LibraryResource{
            int pages;
            String genre;
            Book(String title,String author,int year,int pages,String genre){
                super(title,author,year);
                this.pages = pages;
                this.genre = genre;
                for(List<Object> ls : Library){
                    if(ls.get(0).toString().equals(this.title)){
                        ls.add(pages);
                        ls.add(genre);
                    }
                }
            }
            void details(){
                System.out.println("Title\tAuthor\tYear of Publication\tPages\tGenere\n");
                System.out.println(this.title+ "\t" + this.author + "\t" + this.year + "\t" +this.pages + "\t" + this.genre);
         }

     }
    }
    static class Magazine extends LibraryResource{
        int issue_number;
        int month;
        Magazine(String book,String author,int year,int month,int issue_number){
            super(book,author,year);
            this.month = month;
            this.issue_number = issue_number;
            for(List<Object> ls : Library){
                if(ls.get(0).toString().equals(this.title)){
                    ls.add(month);
                    ls.add(issue_number);
                }
            }

        }
        void details(){
            System.out.println("Month\tissue_number\n");
            System.out.println(this.title+ "\t" + this.author + "\t" + this.year + "\t" +this.month + "\t" + this.issue_number);
        }
    }
    static class Reference_book extends LibraryResource{
        String subject;
        Reference_book(String book,String author,int year,String subject){
            super(book,author,year);
            this.subject = subject;
            for(List<Object> ls : Library){
                if(ls.get(0).toString().equals(this.title)){
                    ls.add(subject);
                }
            }
        }
        void display(){
            System.out.println("Title\tAuthor\tYear of Publication\tSubject\n");
            System.out.println(this.title+ "\t" + this.author + "\t" + this.year + "\t" +this.subject);
        }
    }
    public static void main(String[] args){
        // Creating objects statically
        LibraryResource lr1 = new LibraryResource("Intro to Java", "James Gosling", 1995);
        LibraryResource.Book b1 = new LibraryResource.Book("Effective Java", "Joshua Bloch", 2001, 416, "Programming");
        Magazine m1 = new Magazine("Tech Today", "Editor X", 2024, 9, 45);
        Reference_book r1 = new Reference_book("Math Handbook", "John Doe", 2010, "Mathematics");

        // Display parent class details
        lr1.displayDetails();

        // Display subclass details
        b1.details();
        m1.details();
        r1.display();

        // Display raw ArrayList
        Library_book();
    }
}
