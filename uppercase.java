import java.util.Scanner;

public class uppercase {
    //////////////////To find the first uppercase letter in a given string using recursion, here's a simple Java code implementation:////////
   /*
    Input : geeksforgeeKs
    Output : K

    Input  : geekS
    Output : S
    */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your String");
        String str= sc.next();
        System.out.println(rec(str,0));
    }
    public static char rec(String str,int index){
        if(index>str.length()){
            return '\0';
        }
        if(Character.isUpperCase(str.charAt(index))){
            return str.charAt(index);
        }
        return rec(str,index+1);
    }
}
