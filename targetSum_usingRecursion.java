public class targetSum_usingRecursion {
    public static boolean find(int[]arr,int index,int target,int currsum){
        if(target==0) return true;
        if(target<0 || index==arr.length) return false;
        boolean exclude=find(arr,index+1,target,currsum);
        boolean include=find(arr,index+1,target-arr[index],currsum);
        return include||exclude;

    }
    public static void main(String[] args) {
        int[]arr={1,2,3};
        int target=6;
        int currsum=0;

        System.out.println(find(arr,0,target,currsum));
    }
}
