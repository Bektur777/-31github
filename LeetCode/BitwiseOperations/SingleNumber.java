package bitwiseOperations;

/**
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
 * <p>
 * You must implement a solution with a linear runtime complexity and use only constant extra space.
 * <p>
 *
 *
 * Example 1:
 * <p>
 * Input: nums = [2,2,1]
 * Output: 1
 * Example 2:
 * <p>
 * Input: nums = [4,1,2,1,2]
 * Output: 4
 * Example 3:
 * <p>
 * Input: nums = [1]
 * Output: 1
 */

public class SingleNumber {

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{3, 5, 2, 2, 3}));
    }

    static int singleNumber(int[] nums) {
        int result = 0;

        for (int num : nums) {
            result ^= num;
        }

        return result;

//        return Arrays.stream(nums).reduce((x, y) -> x^y).getAsInt();
    }

}
