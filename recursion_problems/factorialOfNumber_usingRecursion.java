package recursion_problems;

public class factorialOfNumber_usingRecursion {
    static int fact(int n){
        if(n==0||n==1) {
            System.out.println(1);
            return 1;
        }
        int fact=n*fact(n-1);
        System.out.println(fact);
        return fact;
    }
    public static void main(String[]args){
        int n=6;
        fact(6);
    }
}
