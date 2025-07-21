/*
We are given an array. We need to sort the even positioned elements in the ascending order and the odd positioned
 elements in the descending order. We must apply insertion sort to sort them.
Examples:

Input : a[] = {7, 10, 11, 3, 6, 9, 2, 13, 0}
Output :      11  3   7  9  6  10  2  13  0
Even positioned elements after sorting int
ascending order : 3 9 10 13
Odd positioned elements after sorting int
descending order : 11 7 6 2 0
We separately apply the insertion sort technique on the even positioned elements and the odd positioned elements
 separately but within the same array. The loop starts for the odd positioned from the 0th index(1st element) and the
 for the even from the 1st index(2nd element) and keep on increasing by 2 since every alternate is odd/even positioned.
 */

import java.util.Scanner;

public class even_oddPosition_insertionSorting {
    static void even_odd(int[]arr){
        int n=arr.length;

        for(int i=2;i<n;i++){
            int key=arr[i];
            int j=i-2;
            if(i%2==0){
                while(j>=0 && arr[j]<key){
                    arr[j+2]=arr[j];
                    j=j-2;
                }
                arr[j+2]=key;
            }else{
                while(j>=0 && arr[j]>key){
                    arr[j+2]=arr[j];
                    j=j-2;
                }
                arr[j+2]=key;
            }

        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array length");
        int n=sc.nextInt();
        System.out.println("enter array elements");
        int[]arr=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("original array:-");
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
        even_odd(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

}

