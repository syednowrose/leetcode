class Solution {
    public String mergeAlternately(String word1, String word2) {

        String output = "";

        int min = Math.min(word1.length(), word2.length());

        // Merge characters alternately
        for (int i = 0; i < min; i++) {
            output += word1.charAt(i);
            output += word2.charAt(i);
        }

        // Add remaining characters of word1
        for (int i = min; i < word1.length(); i++) {
            output += word1.charAt(i);
        }

        // Add remaining characters of word2
        for (int i = min; i < word2.length(); i++) {
            output += word2.charAt(i);
        }

        return output;
    }
}