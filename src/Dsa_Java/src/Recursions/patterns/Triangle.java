package Dsa_Java.src.Recursions.patterns;

public class Triangle {
    public  static void main(String[] args){
        triangle(4,0);
        triangle2(4,0);
    }
    static void triangle(int rows,int col){
        if(rows == 0){
            return;
        }
        if(col < rows){
            System.out.print(" * ");
            triangle(rows,col+1);
        }
        else{
            System.out.println();
            triangle(rows-1,0);
        }
    }
    static void triangle2(int r,int c){
        if(r == 0){
            return;
        }
        if(r > c){

            triangle2(r,c+1);
            System.out.print(" * " );

        }else{

            triangle2(r-1,0);
            System.out.println();
        }
    }
}
