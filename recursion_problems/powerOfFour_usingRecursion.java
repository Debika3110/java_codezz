package recursion_problems;

public class powerOfFour_usingRecursion {
    static boolean isPowerOfFour(int n){
        if(n<=0) return false;
        while(n%4==0){
            n=n/4;
        }
        return n==1;
    }
    public static void main(String[]args){
        System.out.println(isPowerOfFour(16));
        System.out.println(isPowerOfFour(1));
        System.out.println(isPowerOfFour(3));
    }
}
