public class Solution {

    public static String longestCommonPrefix(String[] strs) {

        String ans = "";

        // Check each character of the first string
        for (int i = 0; i < strs[0].length(); i++) {

            char ch = strs[0].charAt(i);

            // Compare with all other strings
            for (int j = 1; j < strs.length; j++) {

                // If current string is shorter
                if (i >= strs[j].length()) {
                    return ans;
                }

                // If characters are different
                if (strs[j].charAt(i) != ch) {
                    return ans;
                }
            }

            // If all strings have same character
            ans = ans + ch;
        }

        return ans;
    }

    public static void main(String[] args) {

        String[] strs = {"flower", "flow", "flight"};

        System.out.println(longestCommonPrefix(strs));
    }
}