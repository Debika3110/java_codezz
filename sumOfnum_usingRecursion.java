/*
Given a number, we need to find sum of its digits using recursion.

Examples:

Input: 12345
Output: 15
Explanation: Sum of digits → 1 + 2 + 3 + 4 + 5 = 15

Input: 45632
Output: 20
 */



public class sumOfnum_usingRecursion {
    public  static int sum(int num){
        if(num==0) return 0;
        return (num%10+sum(num/10));
    }
    public static void main(String[]args){
        int num=12345;
        int result=sum(num);
        System.out.println("Sum of the number is :- " +result);
    }
}
