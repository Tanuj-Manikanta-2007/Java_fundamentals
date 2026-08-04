package Recursions.String;

public class dice {
    static void Dice(String p,int target){
        if(target == 0){
            System.out.println(p);
            return;
        }
        for(int i = 1;i <= 6 && i <= target;i++){
            Dice(p+i,target-i);
        }
    }
    public static void main(String[] args){
        Dice("",4);
    }
}
