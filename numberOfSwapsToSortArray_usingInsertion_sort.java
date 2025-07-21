/*
Count swaps required to sort an array using Insertion Sort
 */
public class numberOfSwapsToSortArray_usingInsertion_sort {
    static void count(int[]arr){
        int n=arr.length;
        int swap=0;
        for(int i=0;i<n;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
                swap++;
            }
            arr[j+1]=key;
        }
        System.out.println("The number of swaps are :- "+swap);

    }

    public static void main(String[] args) {
       // int[] arr={7,3,9,1};
        int[]arr={5,3,1,2};
        count(arr);
    }
}
