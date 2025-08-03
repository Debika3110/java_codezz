package recursion_problems;/*
Given two numbers x and y find the product using recursion.

Examples :

Input : x = 5, y = 2
Output : 10

Input : x = 100, y = 5
Output : 500

To find the product of two numbers x and y using recursion, you can use the following approach:

Base Case: If y=0, return 0 (since any number multiplied by 0 is 0).

Recursive Case: Add x to result and make a recursive call with y as y-1

Optimization : Since the number of recursive calls is proportional to y and x * y = y * x, we  swap x and y if y is larger than x to reduce the number of recursive calls.
 */

import java.util.Scanner;

public class product_of_two_using_recursion {
    static int product(int a,int b){
        if(b==0) return 0;
        if(b<0){
            return -product(a,-b);
        }
        return(a+product(a,b-1));

    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values of a and b");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int res=product(a,b);
        System.out.println("The product of "+a+"X"+b+"="+res);
    }
}
