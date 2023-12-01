package problems;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public static void main(String[] args) {
        System.out.println(fizzBuzz(15));
    }

    public static List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String answer = "";

            if (i % 3 == 0) {
                answer += "Fizz";
            }
            if (i % 5 == 0) {
                answer += "Buzz";
            }
            if (answer.isEmpty()) {
                answer += String.valueOf(i);
            }

            result.add(answer);
        }

        return result;
    }

}
