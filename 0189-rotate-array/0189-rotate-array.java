class Solution {
    public void rotate(int[] nums, int k) {

        int n = nums.length;
        k = k % n;

        int[] result = new int[n];
        int index = 0;

        for(int i = n - k; i < n; i++){
            result[index++] = nums[i];
        }

        for(int i = 0; i < n - k; i++){
            result[index++] = nums[i];
        }

        for(int i = 0; i < n; i++){
            nums[i] = result[i];
        }
    }
}
public class Main {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;

        Solution s = new Solution();
        s.rotate(nums, k);

        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }
}