/*
Insertion sort is a simple sorting algorithm that works by iteratively inserting each element of an unsorted list into
its correct position in a sorted portion of the list. It is like sorting playing cards in your hands. You split the
cards into two groups: the sorted cards and the unsorted cards. Then, you pick a card from the unsorted group and put
 it in the right place in the sorted group.

We start with the second element of the array as the first element is assumed to be sorted.
Compare the second element with the first element if the second element is smaller then swap them.
Move to the third element, compare it with the first two elements, and put it in its correct position
Repeat until the entire array is sorted.
 */

import java.util.Scanner;
//==================================Loop Approch=============================================
public class insertionSort_onString {
    static void sorting(String[]str){
        int n=str.length;
        for(int i=1;i<n;i++){
            int j=i-1;
            String key=str[i];
            while(j>=0 && str[j].compareTo(key)>0){
                str[j+1]=str[j];
                j--;
            }
            str[j+1]=key;
        }
    }
//=========================================recursive Approch======================================
    static  void sort_rev(String []str, int n){
        //int n=str.length;
        if(n==1) return;
        sort_rev(str,n-1);
        String last=str[n-1];
        int j=n-2;
        while(j>=0 && str[j].compareTo(last)>0){
            str[j+1]=str[j];
            j--;
        }
        str[j+1]=last;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array length");
        int n=sc.nextInt();
        System.out.println("enter array elements");
        String[]arr=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLine();
        }
        System.out.println("original array:-");
        for(String i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
        //sorting(arr);
        sort_rev(arr,n);
        for(String i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

}
