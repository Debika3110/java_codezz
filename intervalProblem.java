
//The "Merge Intervals" problem is a common algorithmic challenge where you are given a collection of intervals,
// and your task is to merge overlapping intervals.
// This problem is typically approached by first sorting the intervals based on their starting points and then iterating through them to merge any that overlap.


import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class intervalProblem {
    public static int[][] interval(int[][]interval){
        if(interval.length==0){
            return (new int[0][0]);
        }
        Arrays.sort(interval,(a,b) -> Integer.compare(a[0],b[0]));
        List<int[]> merge=new ArrayList<>();
        int []currentLevel=interval[0];
        for (int i = 1; i < interval.length; i++) {
            if(currentLevel[1]>=interval[i][0]){
                currentLevel[1]=Math.max(currentLevel[1],interval[i][1]);
            }
            else{
                merge.add(currentLevel);
                currentLevel=interval[i];
            }
        }
        merge.add(currentLevel);
        return merge.toArray(new int[merge.size()][]);
    }
    public static void main (String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of intervals: ");
        int n=sc.nextInt();
        System.out.println("Enter the intervals (start and end):- ");
        int [][]arr=new int[n][2];
        for(int i=0;i<arr.length;i++){
            arr[i][0]=sc.nextInt();
            arr[i][1]=sc.nextInt();
        }
        int [][]ans=interval(arr);
        System.out.println("The merged interval is :- ");
        for(int[] i:ans){

            System.out.println(Arrays.toString(i));
        }

    }
}
