package Problems;

/**
 * You are given a string num representing a large integer. An integer is good if it meets the following conditions:
 *
 * It is a substring of num with length 3.
 * It consists of only one unique digit.
 * Return the maximum good integer as a string or an empty string "" if no such integer exists.
 *
 * Note:
 *
 * A substring is a contiguous sequence of characters within a string.
 * There may be leading zeroes in num or a good integer.
 *
 *
 * Example 1:
 *
 * Input: num = "6777133339"
 * Output: "777"
 * Explanation: There are two distinct good integers: "777" and "333".
 * "777" is the largest, so we return "777".
 */

public class Largest3SameDigit {

    public static void main(String[] args) {

        System.out.println(largestGoodInteger("6777133339"));
        System.out.println(largestGoodInteger("2300019"));
        System.out.println(largestGoodInteger("42352338"));

    }

    public static String largestGoodInteger(String num) {
        String largestSameDigit = "";

        for (int i = 0; i <= num.length() - 3; i++) {
            String substring = num.substring(i, i + 3);
            if (isGoodInteger(substring) && substring.compareTo(largestSameDigit) > 0) {
                largestSameDigit = substring;
            }
        }

        return largestSameDigit;
    }

    static boolean isGoodInteger(String str) {
        return str.charAt(0) == str.charAt(1) && str.charAt(1) == str.charAt(2);
    }

}
