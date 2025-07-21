import java.util.Scanner;

/*
Given a string calculate length of the string using recursion.

Examples:

Input: str = "abcd"
Output: 4
Explanation: The string "abcd" has a length of 4.

Input: str = "GEEKSFORGEEKS"
Output: 13
/*
 */
public class lengthOfString_usingRecursion {
    public static int len(String s){
        if(s.equals("")){
            return 0;
        }
        else{
            return len(s.substring(1))+1;
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s=sc.nextLine();
        int res=len(s);
        System.out.print("length of the string is "+res);
    }
}
