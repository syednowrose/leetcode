

import java.util.Arrays;

class Solution{
    public double findMedianSortedArrays(int[] nums1, int[] nums2){
        int[] result = new int[nums1.length + nums2.length];
        for(int i=0;i<nums1.length;i++){
            result[i] = nums1[i];
        }
        for(int i=0;i<nums2.length;i++){
            result[nums1.length+i]=nums2[i];
        }
        Arrays.sort(result);
        int n = result.length;

        if(n%2==1){
            return result[n/2];
        }
        return (result[(n/2)]+result[(n/2)-1])/2.0;
    }
}
class Main{
    public static void main(String[] args) {
        int[] nums1 ={1,3};
        int[] nums2 ={2};
        Solution s = new Solution();
        System.out.println(s.findMedianSortedArrays(nums1,nums2));
    }
}

