//Given an array of integers, move all the 0s to the end of the array while maintaining
// the relative order of the non-zero elements.
// Do this in-place with minimal extra space.
import java.util.Arrays;
import java.util.Scanner;

public class MoveZeros {
    public static int[] moveZeros(int[]arr){
        int currentZeroindex=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[currentZeroindex]=arr[i];
                currentZeroindex++;
            }

        }
        for (int i = currentZeroindex; i < arr.length; i++) {
            arr[i]=0;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array length");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the array element");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] ans=moveZeros(arr);
        System.out.println(Arrays.toString(ans));
    }
}
