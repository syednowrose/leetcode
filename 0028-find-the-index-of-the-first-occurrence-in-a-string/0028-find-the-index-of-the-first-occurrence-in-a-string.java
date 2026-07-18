class Solution {
    public int strStr(String haystack, String needle) {

        int n = haystack.length();
        int m = needle.length();


        if (m > n) return -1;

        for (int i = 0; i <= n - m; i++) {
            int count = 0;

            for (int j = 0; j < m; j++) {
                char ch1 = needle.charAt(j);
                char ch2 = haystack.charAt(i + j);

                if (ch1 == ch2) {
                    count++;
                } else {
                    break;
                }
            }

            if (count == m) {
                return i;
            }
        }

        return -1;
    }
}

class Main{
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.strStr("sadbutsad","sad"));

    }
}