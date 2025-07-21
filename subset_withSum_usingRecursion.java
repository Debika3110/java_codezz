import java.util.ArrayList;
import java.util.List;

public class subset_withSum_usingRecursion {
    public static void subset_sum(int[]arr, int index,List<Integer>temp, List<String>result){
        if(index==arr.length){

            int sum=0;
            for(int i:temp){
                sum+=i;
            }
            result.add(temp+"->"+sum);
            return;
        }
        //exculde
        subset_sum(arr,index+1,temp,result);
        //include
        temp.add(arr[index]);
        subset_sum(arr,index+1,temp,result);
        temp.remove(temp.size()-1);

    }
    public static void main(String[] args) {
        int[] arr={1,2,3};
        int n=arr.length;
        List<String> result=new ArrayList<>();
        List<Integer>temp=new ArrayList<>();
        subset_sum(arr,0,temp,result);
        System.out.println(result);
    }
}
