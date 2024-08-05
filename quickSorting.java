import java.util.Arrays;

public class quickSorting {
    public static void main(String[] args) {
        int[]arr={5,4,3,2,1};
        quick(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
    public static void quick(int []arr,int low,int high){
        if(low>=high){
            return;
        }
        int s=low;
        int e=high;
        int mid=s + (e-s)/2;
        int pivort=arr[mid];
        while(s<=e){
            while(arr[s]<pivort){
                s++;
            }
             while(arr[e]>pivort){
                 e--;
             }
            if(s<=e){
                int temp=arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }
        }

        quick(arr,low,e);
        quick(arr,s,high);
    }
}
