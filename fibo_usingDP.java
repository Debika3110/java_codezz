/*
fibo(5)
|
|--> fibo(4)
|    |
|    |--> fibo(3)
|    |    |
|    |    |--> fibo(2)
|    |    |    |
|    |    |    |--> fibo(1) → returns 1
|    |    |    |--> fibo(0) → returns 0
|    |    |--> dp[2] = 1
|    |    |
|    |    |--> fibo(1) → returns 1 (base case)
|    |--> dp[3] = 2
|    |
|    |--> fibo(2) → returns **1** from dp[2]
|--> dp[4] = 3
|
|--> fibo(3) → returns **2** from dp[3]
dp[5] = 5

 */


import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class fibo_usingDP {
    //=========================================top-Down approch=========================================================
    /*public static int  fiboTD(int n,int[]dp){
        if(n<=1) return n;
        if(dp[n]!=0) {
            return dp[n];
        }
        return dp[n]=fibo(n-1,dp)+fibo(n-2,dp);
    }*/
    //===================================================Top_Down-2 approch=============================================

   /* public static int  fiboTD2(int n,int[]dp){
        if(n<=1) return n;
        if(dp[n]!=0) {
            return dp[n];
        }
        dp[n]=fibo(n-1,dp)+fibo(n-2,dp);
        System.out.println("The dp array for "+n+ "element is: "+ Arrays.toString(dp));
        return dp[n];
    }*/
//==============================================Bottam-Up approch=======================================================
    public static int fiboBU(int n){
        if(n<=1) return n;
        int[] dp=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];

    }
    public static void main(String[] args) {
        int n=5;
        //int [] dp=new int[n+1];
        //fiboTD2(n,dp);
        /*System.out.println("The Fibonacci series is :- ");
        for(int i=0;i<n;i++){
            System.out.print(fiboTD(i,dp)+" ");
        }*/
        System.out.println(fiboBU(n));
    }
}
