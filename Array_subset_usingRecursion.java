import java.util.ArrayList;
import java.util.List;

class Array_subset_usingRecursion {
    public List<List<Integer>> subsets(int[] nums) {
        //declaring the required arraylists
        List<List <Integer>> res = new ArrayList<>();
        List <Integer> subset = new ArrayList<>();

        dfs(nums , subset , 0 , res);
        return res;
    }

    private void dfs(int[] nums, List<Integer> subset, int i, List<List<Integer>> res) {

        if (i == nums.length){
            res.add(new ArrayList<>(subset));
            return;
        }

        subset.add(nums[i]);

        dfs(nums , subset ,  i + 1 , res);
        subset.remove(subset.size() - 1);
        dfs(nums , subset , i + 1 , res);

    }

    public static void main(String[] args) {
        Array_subset_usingRecursion solution = new Array_subset_usingRecursion();
        int[] nums = {1, 2, 2};
        List<List<Integer>> result = solution.subsets(nums); // we are calling the subsets func

        for (List<Integer> subset : result) {
            System.out.println(subset.toString());
        }
    }
}