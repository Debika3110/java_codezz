import java.util.Scanner;
import java.util.*;
class Merit_of_Strudents{

    public static void fun(int x,int y,int n,int[]arr){
        arr[x-1]=y;
        int ans=1;
        for(int i=1;i<n;i++){
            if(arr[i-1]!=arr[i]){
                ans+=1;
            }
        }
        System.out.println("The merit of the student is "+ans);
    }



    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array size : ");
        int n=sc.nextInt();
        System.out.print("Enter no. of evulations : ");
        int k=sc.nextInt();
        System.out.print("Enter the array elements : ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<k;i++){
            System.out.print("Enter the index : ");
            int x=sc.nextInt();
            System.out.print("Enter no. : ");
            int y=sc.nextInt();
            fun(x,y,n,arr);
        }
    }
}
