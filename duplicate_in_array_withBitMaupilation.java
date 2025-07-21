/*
you are given an array where every element appears twice except one element ,which appears only once .
input:- arr[]={2,3,5,4,5,3,4}
output:- 2
 */
public class duplicate_in_array_withBitMaupilation {
    public static void main(String[] args) {
        int[]arr={2,3,5,4,5,3,4};
        int result=0;
        for(int i=0;i<arr.length;i++){
            result^=arr[i];
        }
        System.out.println(result);
    }
}
