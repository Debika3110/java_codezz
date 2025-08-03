package recursion_problems;/*
Given an array of integers arr[], the task is to find the minimum and maximum elements in the array using recursion only.
*/
import  java.util.Scanner;
public class min_max_useingRecursion {
    public static void min_max(int[]arr,int index,int[]minMax){
        if(index==arr.length) return ;
        if(arr[index]<minMax[0]){
            minMax[0]=arr[index];
        }
        if(arr[index]>minMax[1]){
            minMax[1]=arr[index];
        }
        min_max(arr,index+1,minMax);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter array length");
        int n=sc.nextInt();
        System.out.println("Enter the array element");
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter index");
        int index=sc.nextInt();
        int []minMax={arr[0],arr[1]};
        min_max(arr,index,minMax);
        System.out.println(minMax[0]);
        System.out.println(minMax[1]);
    }
}
