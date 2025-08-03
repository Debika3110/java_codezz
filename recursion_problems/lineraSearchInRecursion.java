package recursion_problems;

import java.util.*;
public class lineraSearchInRecursion {
    public static void main(String[] args) {
        int arr[]={9,7,4,9,0,5,1,8,6,2};
        System.out.println(sorting(arr,9,0));
        System.out.println(index(arr,9,0));
        System.out.println(findAllIndex(arr,9,0,new ArrayList<>()));
    }

    public static boolean sorting(int arr[],int target,int index) {
        if(index==arr.length){
            return false;
        }
        return arr[index]==target || sorting(arr,target,index+1);
    }

    public static int index(int []arr,int target,int index) {
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return index(arr,target,index+1);
    }
    //using arraylist to print frequincy of target number.
    public static ArrayList findAllIndex(int arr[],int target,int index,ArrayList<Integer>list){
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        return findAllIndex(arr,target,index+1,list);
    }
}
