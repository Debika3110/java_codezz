package recursion_problems;/*
Given an integer n, return true if it is a power of two. Otherwise, return false.

An integer n is a power of two, if there exists an integer x such that n == 2x.



Example 1:

Input: n = 1
Output: true
 */

public class powerOfTwo_usingRecursion {
    static boolean isPowerOfTwo(int n){
        if(n<=0) return false;
        while(n%2==0){
            n=n/2;
        }
        return n==1;
    }

    public static void main(String[]args){
        System.out.println(isPowerOfTwo(16));
        System.out.println(isPowerOfTwo(1));
        System.out.println(isPowerOfTwo(3));
    }
}
