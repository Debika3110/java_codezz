package recursion_problems;

import java.util.Scanner;
public class BubbleSort_recursion {
    public static void sorting(int []arr,int n){

        if(n==1)  return;
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                swap(arr,i,i+1);
            }
        }
        sorting(arr,n-1);
    }
    public static void swap(int[]arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n=sc.nextInt();
        System.out.println("Enter your array");
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Original array:- ");
        for(int num:arr){
            System.out.print(num+" ");
        }
        System.out.println();
        sorting(arr,n);
        System.out.println("Sorted array:- ");
        for(int num:arr){
            System.out.print(num+" ");
        }
        System.out.println();
    }
}
