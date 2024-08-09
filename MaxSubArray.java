
// The Maximum Subarray Problem is a classic problem where you are required to find the contiguous subarray within a one-dimensional array that has the largest sum.
// Kadane's Algorithm is a well-known approach to solving this problem in O(n) time.



import java.util.Scanner;
import java.lang.Math;
public class MaxSubArray {
    public static int maxSubarray(int []arr){
        int current=arr[0];
        int max=arr[0];
        int start=0;
        int end=0;
        int temp=0;
        for(int i=1;i<arr.length;i++){
            current=Math.max(arr[i],current+arr[i]);
            if(current==arr[i]){
                temp=i;
            }
            if(current>max){
                max=current;
                start=temp;
                end=i;
            }
        }
        System.out.print("Maximun Sub-Array: [");
        for (int i = start; i <=end; i++) {
            System.out.print(arr[i]);
            if(i!=end){
                System.out.print(",");
            }
        }
        System.out.println("]");
        return max;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("enter your array size:");
        int n=sc.nextInt();
        System.out.println("enter your array:");
        int [] arr=new int[n];
        for (int i = 0; i < n; i++){
            arr[i]=sc.nextInt();
        }
        int ans=maxSubarray(arr);
        System.out.println("the Maximum-Sum :- "+ans);
    }
}
