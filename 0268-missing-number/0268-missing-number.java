class Solution {
    public int missingNumber(int[] nums) {
        int sum =0;
        int missing =0;
        int n1 = nums.length;
        int current = n1*(n1+1)/2;

        for(int i=0;i<nums.length;i++){
            sum = sum + nums[i];
        }

        missing = current - sum;
        return missing;
    }
}

public class Main{
    public static void main(String[] args){
        int[] nums={3,0,1};
        Solution s = new Solution();
        System.out.println(s.missingNumber(nums));
    }
}