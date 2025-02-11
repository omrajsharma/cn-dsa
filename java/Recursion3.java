import java.util.ArrayList;
import java.util.List;

public class Recursion3 {
    private static final String[] KEYPAD = {
            "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    public static void main(String[] args) {
        String str = "abc";

        List<String> subsequences = new ArrayList<>();

        generateSubsequences(str, 0, "", subsequences);

        // print subsequences
        Utils.printStringList(subsequences);

        String digits = "23";
        List<String> combinations = new ArrayList<>();

        generateCombinations(digits, 0, "", combinations);

        Utils.printStringList(combinations);

        findSubArrays("coding");
    }

    public static void findSubArrays(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                System.out.println(str.substring(i, j + 1));
            }
        }
    }

    public static void generateCombinations(String digits, int idx, String current, List<String> combinations) {
        if (idx == digits.length()) {
            combinations.add(current);
            return;
        }

        String letters = KEYPAD[digits.charAt(idx) - '0'];
        for (char letter : letters.toCharArray()) {
            generateCombinations(digits, idx + 1, current + letter, combinations);
        }
    }

    // LIC - Longest Increasing Subsequence (ex - [2,5,7,4,2,5,7,9,4,3] -> (2 4 5 7 9))
    public static void generateSubsequences(String s, int i, String current, List<String> result) {
        if (i == s.length()) {
            result.add(current);
            return;
        }
        generateSubsequences(s, i + 1, current + s.charAt(i), result);
        generateSubsequences(s, i + 1, current, result);
    }
}
