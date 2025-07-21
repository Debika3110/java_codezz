/*
Given an array of strings, sort the array using Selection Sort.

Examples:

Input  : paper true soap floppy flower
Output : floppy, flower, paper, soap, true
 */

public class selectionSortOnString {
    static void sort(String[] str){

        int n=str.length;
        for(int i=0;i<n-1;i++){
            int miniStr=i;
            for(int j=i+1;j<n;j++){
                if(str[j].compareTo(str[miniStr])<0){
                    miniStr=j;
                }
            }
            if(miniStr!=i){
                String temp=str[i];
                str[i]=str[miniStr];
                str[miniStr]=temp;
            }
        }
    }
    public static void main(String[] args) {
        String[] arr = {"paper", "true", "soap", "floppy", "flower"};

        System.out.println("Original array:");
        for (String s : arr) {
            System.out.print(s + " ");
        }
        System.out.println();

        sort(arr);

        System.out.println("Sorted array:");
        for (String s : arr) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
