package recursion_problems;

import java.util.ArrayList;
import java.util.List;

public class permutationWithSwap_usingRecursion {
    public static void permute(int[]arr,int index,List<List<Integer>>ans){
        if(arr.length==index){
            List<Integer>temp=new ArrayList<>();
            for(int i:arr){
                temp.add(i);
            }
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=index;i<arr.length;i++){
            swap(arr,index,i);
            permute(arr,index+1,ans);
            swap(arr,i,index);

        }

    }
    public static void swap(int[]arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static void main(String[] args) {
        //[[1, 2, 3], [1, 3, 2], [2, 1, 3], [2, 3, 1], [3, 1, 2], [3, 2, 1]]
        int[]arr={1,2,3};
        List<List<Integer>>ans=new ArrayList<>();
        permute(arr,0,ans);
        System.out.println(ans);


    }
}
