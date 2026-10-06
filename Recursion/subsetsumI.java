import java.util.ArrayList;
import java.util.List;

public class subsetsumI {

    static void sum(int idx, int[] nums, List<Integer> list, int su) {

        if (idx == nums.length) {
            list.add(su);
            return;
        }

        // Take
        sum(idx + 1, nums, list, su + nums[idx]);

        // Not Take
        sum(idx + 1, nums, list, su);
    }

    public List<Integer> subsetSums(int[] nums) {
        List<Integer> list = new ArrayList<>();

        sum(0, nums, list, 0);

        return list;
    }

    public static void main(String[] args) {

        int[] arr = {1, 0, 9, 8, 5};

        subsetsumI obj = new subsetsumI();

        List<Integer> result = obj.subsetSums(arr);

        System.out.println(result);
    }
}