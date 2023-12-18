package problems;

public class MaximumProductDifferenceBetweenTwoPairs {

    public static void main(String[] args) {

        System.out.println(maxProductDifference(new int[]{1,6,7,5,2,4,10,6,4}));

    }

    static int maxProductDifference(int[] nums) {
        int max1 = nums[0], max2 = 0, min1 = nums[0], min2 = Integer.MAX_VALUE;

        for (int i = 1; i < nums.length; i++) {
            if (max1 <= nums[i]) {
                max2 = max1;
                max1 = nums[i];
            }
            else if (max2 <= nums[i]) {
                max2 = nums[i];
            }
            if (min1 >= nums[i]) {
                min2 = min1;
                min1 = nums[i];
            }
            else if (min2 >= nums[i]) {
                min2 = nums[i];
            }
        }

        System.out.println("MaxNum: " + max1 + " MaxNum2: " + max2);
        System.out.println("MinNum: " + min1 + " MinNum2: " + min2);

        return max1 * max2 - min1 * min2;
    }

}
