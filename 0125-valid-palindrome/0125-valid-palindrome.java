class Solution {
    public boolean isPalindrome(String s) {
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            ch = Character.toLowerCase(ch);
            if (Character.isLetterOrDigit(ch)) {
                result = result + ch;
            }
        }

        int start=0;
        int end = result.length()-1;

        while(start<end){
            if(result.charAt(start) != result.charAt(end)){
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}
class Main{
    public static void main(String[] args) {
        String s="A man, a plan,a Canal: Panama";
        Solution sol= new Solution();
        System.out.println(sol.isPalindrome(s));
    }
}