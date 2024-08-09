import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
public class AddsumMatch {
    public static ArrayList<int[]> addSum(int [] arr, int target){
        ArrayList<int[]> result =new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            int complement=target-arr[i];
            if(map.containsKey(complement)){
                result.add(new int[] {map.get(complement),i});
            }
            map.put(arr[i],i);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array length");
        int n=sc.nextInt();
        System.out.println("enter the array element");
        int []arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the target");
        int target=sc.nextInt();
        ArrayList<int[]>ans=addSum( arr,target);

        if(ans.isEmpty()){
            System.out.println("no answer found");
        }
        for(int[] pair: ans){
            System.out.println(target+"="+pair[0]+"+"+pair[1]);
        }
    }
}
