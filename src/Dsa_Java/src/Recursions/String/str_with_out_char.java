package Dsa_Java.src.Recursions.String;

public class str_with_out_char {
    static String a(String str1,int index){
        if(index == str1.length() ) return "";
        char  ch  = str1.charAt(index);
        if(ch != 'a' && ch != 'A'){
            return ch + a(str1,index+1);
        }
        else{
            return a(str1,index+1);
        }
    }
    static String skipApple(String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("apple"))
            return skipApple(up.substring(5));
        else{
            return up.charAt(0) + skipApple(up.substring(1));
        }
    }
    static String skipAppNotApple(String up){
        if(up.isEmpty()) return "";
        if(up.startsWith("app") && !up.startsWith("apple")){
            return skipAppNotApple(up.substring(3));
        }else{
            return up.charAt(0) + skipAppNotApple(up.substring(1));
        }
    }
    public static void main(String[] args){
        String str1 = "banana";
        System.out.println(a(str1,0));
        System.out.println(skipApple("bananappleeboski"));
        System.out.println(skipAppNotApple("appnotapples"));
    }
}
