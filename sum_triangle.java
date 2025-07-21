import java.util.Arrays;
import java.util.Scanner;

/*
✅ Example
Suppose the array is:
[1, 2, 3, 4, 5]
We build the triangle like this:

Level 0 (original): 1 2 3 4 5

Level 1: 3 5 7 9 (because 1+2=3, 2+3=5, 3+4=7, 4+5=9)

Level 2: 8 12 16 (3+5=8, 5+7=12, 7+9=16)

Level 3: 20 28 (8+12=20, 12+16=28)

Level 4: 48 (20+28=48)

Hence, the triangle printed from top to bottom is:

48
20 28
8 12 16
3 5 7 9
1 2 3 4 5

 */
public class sum_triangle {
    public static void sum_triangle(int[]arr){
        if(arr.length<1) return;
        int [] temp=new int[arr.length-1];
        for(int i=0;i<arr.length-1;i++){
            temp[i]=arr[i]+arr[i+1];
        }
        sum_triangle(temp);
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[]args){
       // int []arr={1,2,3,4,5};
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your array size");
        int n=sc.nextInt();
        System.out.println("Enter your array");
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sum_triangle(arr);
    }
}
