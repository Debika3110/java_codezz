import java.util.List;
import java.util.ArrayList;
public class subsetSum_usingRecursion {
   public static void subset(int[]arr,int index,List<Integer>result,int temp){
        if(index==arr.length){
            result.add(temp);
            return;
        }
        subset(arr,index+1,result,temp);
        subset(arr,index+1,result,temp+arr[index]);

//=======================================================
//output:= [0, 3, 2, 5, 1, 4, 3, 6]
    }


    public static void main(String[] args) {
        int[] arr={1,2,3};
        int n=arr.length;
        List<Integer> result=new ArrayList<>();
        int temp=0;
        subset(arr,0,result,temp);
        System.out.println(result);
    }
}
