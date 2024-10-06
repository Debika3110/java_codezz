//Given an array arr[] of size n and a number k, rotate the array to the right by k steps. The goal is to do this in-place with O(1) extra space.

       // For example:

        //Input: arr = [1, 2, 3, 4, 5, 6, 7], k = 3
        //Output: arr = [5, 6, 7, 1, 2, 3, 4]
        //Approach:
        //Reverse the whole array.
        //Reverse the first k elements.
        //Reverse the last n-k elements.
import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    public static void rotate(int[]arr,int k){
        int n=arr.length;
        k=k%n;
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);


    }
    public static void reverse(int[]arr,int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array length");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("enter the array element");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter number of time to be rotated");
        int k=sc.nextInt();
        rotate(arr,k);
        System.out.println("After rotation the array: ");
        System.out.print(Arrays.toString(arr));
    }
}
