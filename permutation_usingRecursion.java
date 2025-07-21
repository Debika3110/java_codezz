/*
In this method we are going to use the extra visit and temp array for our ease
 */

import java.util.ArrayList;
import java.util.List;
public class permutation_usingRecursion {
    public static void  permute(int[]arr,int[]visit,List<Integer> temp,List<List<Integer>>result ){

        if(temp.size()==arr.length){
            result.add(new ArrayList<>(temp));
            return;
        }

        for(int i=0;i<arr.length;i++){
            if(visit[i]==0){
                visit[i]=1;
                temp.add(arr[i]);
                permute(arr,visit,temp,result);
                temp.remove(temp.size()-1);
                visit[i]=0;

            }
        }
    }
    public static void main(String[]args){
        int[]arr={1,2,3};
        List<List<Integer>>result=new ArrayList<>();
        List<Integer> temp =new ArrayList<>();
        int []visit=new int[arr.length];
        //permute();
        permute(arr,visit,temp,result);
        System.out.println(result);
    }
}
