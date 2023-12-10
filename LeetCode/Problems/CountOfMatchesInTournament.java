package Problems;

public class CountOfMatchesInTournament {

    public static void main(String[] args) {

        System.out.println(numberOfMatches(7));
        System.out.println(numberOfMatches(14));

    }

    static int numberOfMatches(int n) {
        int count = 0;

        while (n != 1) {
            if (n % 2 != 0) {
                count += (n - 1) / 2;
                n = (n - 1) / 2 + 1;
            }
            if (n % 2 == 0) {
                n /= 2;
                count += n;
            }
        }

        return count;
    }

}
