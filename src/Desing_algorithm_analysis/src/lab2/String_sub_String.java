package Desing_algorithm_analysis.src.lab2;

public class String_sub_String {
    public static void main(String[] args){
        String str1 = "aabbaaaa";
        String str2 = "aa";
        sub_str_pattern(str1,str2);
    }
    static  void sub_str_pattern(String str,String sub_str){
        int m = str.length();
        int n = sub_str.length();
        int i;
        int j;
        for(i = 0;i < m-n;i++){
            for(j = 0;j < n;j++){
                if(str.charAt(i+j) != sub_str.charAt(j)){
                    break;
                }
            }if(j == n){
                System.out.println(i + "  ");
            }
        }
    }
}
