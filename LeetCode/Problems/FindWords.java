package Problems;

import java.util.HashMap;
import java.util.Map;

/**
 * You are given an array of strings words and a string chars.
 *
 * A string is good if it can be formed by characters from chars (each character can only be used once).
 *
 * Return the sum of lengths of all good strings in words.
 *
 *
 *
 * Example 1:
 *
 * Input: words = ["cat","bt","hat","tree"], chars = "atach"
 * Output: 6
 * Explanation: The strings that can be formed are "cat" and "hat" so the answer is 3 + 3 = 6.
 * Example 2:
 *
 * Input: words = ["hello","world","leetcode"], chars = "welldonehoneyr"
 * Output: 10
 * Explanation: The strings that can be formed are "hello" and "world" so the answer is 5 + 5 = 10.
 */

public class FindWords {

    public static void main(String[] args) {

        System.out.println(countCharacters(new String[]{"hello","world","leetcode"}, "welldonehoneyr"));
    }

    static int countCharacters(String[] words, String chars) {
        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : chars.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        int length = 0;

        for (String word : words) {
            if (canFormWord(word, new HashMap<>(charCount))) {
                length += word.length();
            }
        }

        return length;
    }

    static boolean canFormWord(String word, Map<Character, Integer> charCount) {
        for (char c : word.toCharArray()) {
            if (!charCount.containsKey(c) || charCount.get(c) == 0) {
                return false;
            }
            charCount.put(c, charCount.get(c) - 1);
        }
        return true;
    }
}
