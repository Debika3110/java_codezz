package recursion_problems;/*
Geek created a random series and given a name geek-onacci series. Given four integers A, B, C, N. A, B, C represents the
 first three numbers of geek-onacci series. Find the Nth number of the series. The nth number of geek-onacci series is a
 sum of the last three numbers (summation of N-1th, N-2th, and N-3th geek-onacci numbers)
 Example:
Input:
3
1 3 2 4
1 3 2 5
1 3 2 6

Output:
6
11
19
 */
import java.util.Scanner;
public class geek_onachi_no {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the test cases");
        int T=sc.nextInt();
        while(T-- >0){
            int A=sc.nextInt();
            int B=sc.nextInt();
            int C=sc.nextInt();
            int n=sc.nextInt();

            if(n==1){
                System.out.println(A);
            }else if(n==2){
                System.out.println(B);
            } else if (n==3) {
                System.out.println(C);
            }else{
                int prev3=A;
                int prev2=B;
                int prev1=C;
                int current=0;
                for(int i=4;i<=n;i++){
                    current=prev3+prev2+prev1;
                    prev3=prev2;
                    prev2=prev1;
                    prev1=current;
                }
                System.out.println(current);
            }
        }


    }
}
