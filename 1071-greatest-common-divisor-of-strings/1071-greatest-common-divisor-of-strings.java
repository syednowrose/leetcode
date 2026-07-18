class Solution {

    public String gcdOfStrings(String str1, String str2) {

        String smaller;

        // Find the smaller string
        if (str1.length() < str2.length()) {
            smaller = str1;
        } else {
            smaller = str2;
        }

        // Check every possible prefix from largest to smallest
        for (int i = smaller.length(); i >= 1; i--) {

            String candidate = smaller.substring(0, i);

            if (check(str1, candidate) && check(str2, candidate)) {
                return candidate;
            }
        }

        return "";
    }

    // Function to check whether candidate divides the string
    public boolean check(String str, String candidate) {

        // Length must be divisible
        if (str.length() % candidate.length() != 0) {
            return false;
        }

        String temp = "";

        while (temp.length() < str.length()) {
            temp += candidate;
        }

        return temp.equals(str);
    }
}

public class Main {

    public static void main(String[] args) {

        String str1 = "ABABAB";
        String str2 = "ABAB";

        Solution obj = new Solution();

        System.out.println(obj.gcdOfStrings(str1, str2));
    }
}