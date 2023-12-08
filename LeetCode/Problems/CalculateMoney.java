package Problems;

/**
 * Hercy wants to save money for his first car. He puts money in the Leetcode bank every day.
 *
 * He starts by putting in $1 on Monday, the first day. Every day from Tuesday to Sunday, he will put in $1 more than the day before. On every subsequent Monday, he will put in $1 more than the previous Monday.
 * Given n, return the total amount of money he will have in the Leetcode bank at the end of the nth day.
 *
 *
 *
 * Example 1:
 *
 * Input: n = 4
 * Output: 10
 * Explanation: After the 4th day, the total is 1 + 2 + 3 + 4 = 10.
 * Example 2:
 *
 * Input: n = 10
 * Output: 37
 * Explanation: After the 10th day, the total is (1 + 2 + 3 + 4 + 5 + 6 + 7) + (2 + 3 + 4) = 37. Notice that on the 2nd Monday, Hercy only puts in $2.
 */

public class CalculateMoney {

    public static void main(String[] args) {

        System.out.println(totalMoney(20));

    }

    static int totalMoney(int n) {
        int total = 0;

        for (int day = 1; day <= n; day++) {
            total += day % 7 == 0 ? 6 + day / 7 : day % 7 + day / 7;
        }

        return total;
    }

}
