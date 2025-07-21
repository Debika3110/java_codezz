import java.util.*;
public class mergeSort_usingLists {
    public static  void mergesort(List<Integer> s,int left,int right){
         if(left>=right) return;
        int mid=left+(right-left)/2;
        mergesort(s,left,mid);
        mergesort(s,mid+1,right);
        merge(s,left,mid,right);
    }
    public static void merge(List<Integer>s,int left,int mid,int right){
        ArrayList<Integer> temp=new ArrayList<>();
        int i=left;
        int j=mid+1;
        while(i<=mid && j<=right){
            if(s.get(i)<=s.get(j)){
                temp.add(s.get(i++));
            }else{
                temp.add(s.get(j++));
            }
        }
        while(i<=mid){
            temp.add(s.get(i++));
        }
        while(j<=right){
            temp.add(s.get(j++));
        }
        for(int k=0;k<temp.size();k++){
            s.set(k+left,temp.get(k));
        }

    }
    public static void main(String[] args) {
        List<Integer> s = new ArrayList<>(Arrays.asList(5, 2, 9, 1, 6, 3));
        mergesort(s, 0, s.size() - 1);
        System.out.println(s);
    }
}
