package problems;

/**
 * 1662. Check If Two String Arrays are Equivalent
 * Easy
 * 2.6K
 * 188
 * Companies
 * Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.
 *
 * A string is represented by an array if the array elements concatenated in order forms the string.
 *
 *
 *
 * Example 1:
 *
 * Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
 * Output: true
 * Explanation:
 * word1 represents string "ab" + "c" -> "abc"
 * word2 represents string "a" + "bc" -> "abc"
 * The strings are the same, so return true.
 * Example 2:
 *
 * Input: word1 = ["a", "cb"], word2 = ["ab", "c"]
 * Output: false
 * Example 3:
 *
 * Input: word1  = ["abc", "d", "defg"], word2 = ["abcddefg"]
 * Output: true
 */

public class CheckIfTwoStringArraysAreEquivalent {

    public static void main(String[] args) {
        System.out.println(arrayStringsAreEqual(new String[]{"a", "bc"}, new String[]{"ab", "c"}));
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        return getWords(word1).equals(getWords(word2));
    }

    public static String getWords(String[] arrWord) {
        StringBuilder words = new StringBuilder();

        for (String word : arrWord) {
            words.append(word);
        }

        return words.toString();
    }
}

