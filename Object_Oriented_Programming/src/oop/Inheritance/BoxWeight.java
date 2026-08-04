package oop.Inheritance;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight(){
        super();
        this.weight = -1;
    }
    public BoxWeight(double l,double h,double w,double weight){
        super(l,h,w);
        this.weight = weight;
    }
    BoxWeight(BoxWeight other){
        super(other);
        this.weight = other.weight;
    }

}
