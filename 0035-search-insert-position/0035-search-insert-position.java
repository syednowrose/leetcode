class Solution{
    public int searchInsert(int[] nums,int target){
        int left =0;
        int right = nums.length-1;
        int i=0;
        while(left<=right){
            int mid = (left + right)/2;

            if(nums[mid] == target){
                return mid;
            }

            else if(nums[mid] < target){
                left=mid+1;
            }

            else{
                right = mid -1;
            }
        }
        return left;
    }
}
class Main{
    public static void main(String[] args) {
        Solution s= new Solution();
        int[] nums ={ 1,2,3,4};
        int target =5;
        int left =s.searchInsert(nums,target);
        System.out.println(left);
    }
}