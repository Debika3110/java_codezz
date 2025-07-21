
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class permutationWithOutDuplicates_usingRecursion {
    public static void permute(int[]arr,int index,List<List<Integer>>ans){
        if(index==arr.length){
            List<Integer>temp=new ArrayList<>();
            for(int i:arr){
                temp.add(i);
            }
            ans.add(temp);
            return;
        }

        Set<Integer>used=new HashSet<>();
        for(int i=index;i<arr.length;i++){
            if(used.contains(arr[i])) continue;
            used.add(arr[i]);
                swap(arr,index,i);

                permute(arr,index+1,ans);
                swap(arr,index,i);



        }
    }

    static void swap(int[]arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static void main(String[] args) {
        int[]arr={1,2,2};
        List<List<Integer>> ans=new ArrayList();

        permute(arr,0,ans);
        System.out.println(ans);
    }
}
