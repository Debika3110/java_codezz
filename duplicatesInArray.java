import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class duplicatesInArray {
    public static int[] duplicate(int[]nums){
        Set<Integer> seen=new HashSet<>();
        Set<Integer>Duplicate=new HashSet<>();
        for(int num:nums){
            if(seen.contains(num)){
                Duplicate.add(num);
            }
            else{
                seen.add(num);
            }
        }
        int[]dupli=new int[Duplicate.size()];
        int index=0;
        for(int num:Duplicate){
            dupli[index++]=num;
        }
        return dupli;
    }
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 8, 3, 1};
        int[] ans = duplicate(nums);
        System.out.println("The duplicates are: " + Arrays.toString(ans));
    }
}