public class Str {
    public static void main(String[] args) {
        System.out.println("### STRING ###");

        char omI = 'o';
        char[] name = {'o', 'm', 'r', 'a', 'j'};
        String name1 = "Omraj Sharma";
        String name2 = "omraj sharma";

        System.out.println(name1);
        System.out.println(name1.length());
        System.out.println(name1.substring(6));
        System.out.println(name1.toLowerCase());
        System.out.println(name1.toUpperCase());
        System.out.println(name1.charAt(2));
        System.out.println(name1.contains("Om"));
        System.out.println(name1.indexOf('r'));
        System.out.println(name1.lastIndexOf('r'));


        // Reverse a string
        StringBuilder convertedString = new StringBuilder();
        for (int i = name1.length() - 1; i >= 0; i--) {
            convertedString.append(name1.charAt(i));
            System.out.print(i);
        }
        System.out.println(convertedString);

        // ASSIGNMENT - Reverse words in the string ex: "omraj sharma" -> "sharma omraj"

        // Reverse a number
        int num = 987654321;
        while (num > 0) {
            System.out.print(num % 10);
            num /= 10;
        }
        System.out.println();


        System.out.println(isPalindrome("nitin"));

        printCountOfVowelAndConsonants("omrajsharma");

        System.out.println(10801/10);

    }

    // Check Palindrome ex: nitin -> nitin, 1001 -> 1001
    public static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) return false;

            start++;
            end--;
        }

        return true;
    }

    // Count vowels and consonants in the string
    public static void printCountOfVowelAndConsonants(String str) {
        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                vowelCount++;
            else
                consonantCount++;
        }

        System.out.println("Count of vowels: " + vowelCount);
        System.out.println("Count of consonants: " + consonantCount);

        System.out.println(toggleCase("Omraj Sharma"));
    }

    // convert string char from upper to lower and lower to upper - Omraj -> oMRAJ
    public static String toggleCase( String str) {
        StringBuilder toggledStr = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                toggledStr.append((char) (ch + 32));
            } else if (ch >= 'a' && ch <= 'z') {
                toggledStr.append((char) (ch - 32));
            } else {
                toggledStr.append(ch);
            }
        }

        return toggledStr.toString();
    }

}
