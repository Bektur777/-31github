package Problems;

/**
 * Given the array of integers nums, you will choose two different indices i and j of that array. Return the maximum value of (nums[i]-1)*(nums[j]-1).
 *
 *
 * Example 1:
 *
 * Input: nums = [3,4,5,2]
 * Output: 12
 * Explanation: If you choose the indices i=1 and j=2 (indexed from 0), you will get the maximum value, that is, (nums[1]-1)*(nums[2]-1) = (4-1)*(5-1) = 3*4 = 12.
 * Example 2:
 *
 * Input: nums = [1,5,4,5]
 * Output: 16
 * Explanation: Choosing the indices i=1 and j=3 (indexed from 0), you will get the maximum value of (5-1)*(5-1) = 16.
 * Example 3:
 *
 * Input: nums = [3,7]
 * Output: 12
 */

public class MaxProductOfTwoElementsInArray {

    public static void main(String[] args) {

        System.out.println(maxProduct(new int[] {3,4,5,2}));
        System.out.println(maxProduct(new int[] {1,5,4,5}));
        System.out.println(maxProduct(new int[] {3,7}));

    }

    static int maxProduct(int[] nums) {
        int max1 = 0;
        int max2 = 0;

        for (int i = 1; i < nums.length; i++) {
            if (max1 < nums[i]) {
                max1 = nums[i];
            }
            if (max2 < nums[i - 1]) {
                max2 = nums[i - 1];
            }
        }

        return (max1 - 1) * (max2 - 1);
    }

}
