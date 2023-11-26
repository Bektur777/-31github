package bitwiseOperations;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an integer array nums of unique elements, return all possible
 * subsets
 *  (the power set).
 * <p>
 * The solution set must not contain duplicate subsets. Return the solution in any order.
 * <p>
 *
 *
 * Example 1:
 * <p>
 * Input: nums = [1,2,3]
 * Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
 * Example 2:
 * <p>
 * Input: nums = [0]
 * Output: [[],[0]]
 * <p>
 *
 * Constraints:
 * <p>
 * 1 <= nums.length <= 10
 * -10 <= nums[i] <= 10
 * All the numbers of nums are unique.
 */

public class Subsets {

    public static void main(String[] args) {
        System.out.println(subsets(new int[]{1, 2, 3, 4}));
    }

    static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();

        for (int mask = 0; mask < (1 << nums.length); mask++) {
            List<Integer> subset = new ArrayList<>();
            for (int j = 0; j < nums.length; j++) {
                if ((mask & (1 << j)) >= 1) {
                    subset.add(nums[j]);
                }
            }

            subsets.add(subset);
        }

        return subsets;
    }

}
