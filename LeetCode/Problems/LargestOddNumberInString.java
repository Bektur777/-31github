package Problems;

/**
 * You are given a string num, representing a large integer. Return the largest-valued odd integer (as a string) that is a non-empty substring of num, or an empty string "" if no odd integer exists.
 *
 * A substring is a contiguous sequence of characters within a string.
 *
 *
 *
 * Example 1:
 *
 * Input: num = "52"
 * Output: "5"
 * Explanation: The only non-empty substrings are "5", "2", and "52". "5" is the only odd number.
 * Example 2:
 *
 * Input: num = "4206"
 * Output: ""
 * Explanation: There are no odd numbers in "4206".
 * Example 3:
 *
 * Input: num = "35427"
 * Output: "35427"
 * Explanation: "35427" is already an odd number.
 */

public class LargestOddNumberInString {

    public static void main(String[] args) {

        System.out.println(largestOddNumber("52"));
        System.out.println(largestOddNumber("4206"));
        System.out.println(largestOddNumber("35427"));

    }

    static String largestOddNumber(String num) {
        int length = 0;

        for (int i = num.length() - 1; i >= 0; i--) {
            if ((int) (num.charAt(i)) % 2 != 0) {
                length = i + 1;
                break;
            }
        }

        return num.substring(0, length);
    }

}
