import java.util.HashSet;

public class IntersectionofTwoArrays {
    public static int[] intersection(int[]num1,int[]num2){
        HashSet<Integer> set1=new HashSet<>();
        for(int i:num1){
            set1.add(i);
        }
        HashSet<Integer>set2=new HashSet<>();
        for(int i:num2){
            if(set1.contains(i)){
                set2.add(i);
            }
        }
        int[]resultSet=new int[set2.size()];
        int i=0;
        for(int num:set2){
            resultSet[i++]=num;
        }
        return resultSet;

    }
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        int[] intersection = intersection(nums1, nums2);
        System.out.print("Intersection: ");
        for (int num : intersection) {
            System.out.print(num + " ");
        }
    }
}
