package recursion_problems;

public class targetSum_withRepetingNumbers_usingRecursion {
    static int find(int[]arr,int index,int target){
        if(target==0){
            return 1;
        }
        if(target<0 || index==arr.length){
            return 0;
        }
        if(arr[index]==0){
            return find(arr,index+1,target);
        }

        return find(arr,index+1,target)+find(arr,index,target-arr[index]);

    }
    public static void main(String[] args) {
        int[]arr={0,1,2};
        int target=6;
        System.out.println(find(arr,0,target));

    }
}
