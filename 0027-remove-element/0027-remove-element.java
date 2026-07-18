class  Solution{
    public int removeElement(int[] nums, int val ){
        int k = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == val){
                continue;
            }
            nums[k] = nums[i];
            k++;
        }
        return k;
    }
}

class Main {
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3, 4};
        int val = 3;
        Solution s = new Solution();
        int k=s.removeElement(nums,val);
        for(int i=0;i<k;i++) {
            System.out.println(nums[i]);
        }
    }

}