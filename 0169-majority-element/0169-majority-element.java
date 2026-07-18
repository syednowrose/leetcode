class Solution {
    public int majorityElement(int[] nums) {

        int candidate = 0;
        int count = 0;

        for(int i = 0; i < nums.length; i++) {

            if(count == 0) {
                candidate = nums[i];
            }

            if(nums[i] == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }
}

class main{
    public static void main(String[] args) {
        int[] nums ={2,2,1,1,1,2,2};

        Solution s= new Solution();
        System.out.println(s.majorityElement(nums));
    }
}