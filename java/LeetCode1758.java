import java.util.HashMap;
import java.util.Map;

public class LeetCode1758 {

    public static void main(String args[]) {


        System.out.println(minOperations("1111"));
    }

    public static int minOperations(String s) {
        String expectedString1 = "";
        for (int i = 0; i < s.length(); i++) {
            expectedString1 = expectedString1.concat(String.valueOf(i % 2));
        }

        String expectedString2 = "";
        for (int i = 1; i <= s.length(); i++) {
            expectedString2 = expectedString2.concat(String.valueOf(i % 2));
        }

        int count1 = 0;
        for (int i = 0 ; i < s.length(); i++) {
            if (s.charAt(i) != expectedString1.charAt(i)) {
                count1++;
            }
        }

        int count2 = 0;
        for (int i = 0 ; i < s.length(); i++) {
            if (s.charAt(i) != expectedString2.charAt(i)) {
                count2++;
            }
        }

        return Math.min(count1, count2);
    }
}
