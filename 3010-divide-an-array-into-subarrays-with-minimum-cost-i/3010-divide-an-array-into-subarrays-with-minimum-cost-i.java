class Solution {
    public int minimumCost(int[] nums) {
        int n = nums.length;

       int min1 = Integer.MAX_VALUE;
        int min2 =Integer.MAX_VALUE;

        for (int i = 1; i < n; i++) {
            if (nums[i] < min1) {
                min2 = min1;      
                min1 = nums[i];  
            } else if (nums[i] < min2) {
                min2 = nums[i];   
            }
        }

        return nums[0] + min1 + min2;
    }
}
public class Main{
    public static void main(String [] args){
        Solution a = new Solution();
        int[] nums= {1,2,3,12};
        int[] nums1={5,4,3};
        System.out.println(a.minimumCost(nums));
        System.out.println(a.minimumCost(nums1));
    }
}