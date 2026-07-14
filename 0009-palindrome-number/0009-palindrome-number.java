class Solution {
    public boolean isPalindrome(int x) {
        int copy = x;
        int reverse = 0;
        int i=0;

        if(x<0){
            return false;
        }

        while(x != 0) {
            int digit = x % 10;
            reverse = reverse * 10 + digit;
            x = x / 10;
        }
        return copy == reverse;
    }

}
public class Main {
    public static void main(String[] args) {
        Solution a = new Solution();
        System.out.println(a.isPalindrome(121));
        System.out.println(a.isPalindrome(-121));
        System.out.println(a.isPalindrome(10));

    }
}