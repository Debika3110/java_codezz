package recursion_problems;

public class checkArrayIsSortedOrNot_usingRecursion {
    static boolean isSorted(int[]arr,int index){
        if(index==arr.length-1||arr.length==0) return true;
        if(arr[index]>arr[index+1]){
            return false;
        }
        return isSorted(arr,index+1);
    }
    public static void main(String[]args){
        int[]arr={5,3,1,4,2};
        int[]arr1={1,2,3,4,5};
        boolean a=isSorted(arr,0);
        boolean b=isSorted(arr1,0);
        System.out.println(a);
        System.out.println(b);

    }
}
