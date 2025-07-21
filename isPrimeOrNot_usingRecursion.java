/*
Given a number n, check whether it's prime number or not using recursion.
Examples:


Input : n = 11
Output : Yes

Input : n = 15
Output : No
 */

public class isPrimeOrNot_usingRecursion {
    public static boolean isPrime(int num,int i){
        if(num<=1) return false;
        if(num%i==0) return false;
        if(i*i>num) return true;

        return isPrime(num,i+1);
    }
    public static void main(String[]args){
        int num=13;
        int i=2;
        System.out.println("The number "+num+" is prime ? "+isPrime(num,i));
    }
}
