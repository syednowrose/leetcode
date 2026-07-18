class Solution {
    public int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {

            digits[i] = digits[i] + 1;

            if (digits[i] == 10) {
                digits[i] = 0;
            }

            else {
                return digits;
            }
        }


        int[] new_a = new int[digits.length + 1];
        new_a[0] = 1;
        return new_a;

    }
}
class Main {
    public static void main(String[] args) {

        Solution sol = new Solution();

        int[] a1 = {1, 2, 4};
        int[] a2 = {9};

        System.out.println(Arrays.toString(sol.plusOne(a1)));
        System.out.println(Arrays.toString(sol.plusOne(a2)));

    }
}