class Solution {
    public int[] sortedSquares(int[] nums) {
        int l = 0;
        int r = nums.length-1;
        int p = nums.length-1;

        int ans[] = new int[nums.length];
        while( l<=r){
            int left  = nums[l]* nums[l];
            int right = nums[r]* nums[r];
            if( left > right){
                ans[p] = left;
                l++;
            }else{
                ans[p] = right;
                r--;
            }
            p--;


        }
        return ans;
        
    }
}