import java.util.Arrays;

class Solution {
    public boolean containsDuplicate(int[] nums) {

        Arrays.sort(nums);  

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i-1]) {
                return true;
            }
        }

        return false;
    }
}



class main{
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        Solution s= new Solution();
        System.out.println(s.containsDuplicate(nums));
    }
}