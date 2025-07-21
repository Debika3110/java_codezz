import java.util.ArrayList;
import java.util.List;


/*
Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.



Example 1:

Input: n = 3
Output: ["((()))","(()())","(())()","()(())","()()()"]
Example 2:

Input: n = 1
Output: ["()"]
 */
public class generateParanthesis_usingRecursion {
    public static void para(int n,int left,int right,String temp,List<String>str){
        if(n==left && right==n){
            str.add(temp);
            return;
        }
        if(left<n){
            //String newTemp=temp+"(";
            para(n,left+1,right,temp+"(",str);

        }
        if(right<left){

            para(n,left,right+1,temp+")",str);

        }
    }
    public static void main(String[] args) {
        List<String> str=new ArrayList<>();
        int n=3;
        String temp="";
        int left=0;
        int right=0;
        para(n,left,right,temp,str);
        System.out.println(str);
    }
}
