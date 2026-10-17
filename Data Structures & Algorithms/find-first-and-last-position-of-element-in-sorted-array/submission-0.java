class Solution {
    public int[] searchRange(int[] nums, int target) {
        int firstindex = findbound(nums,target,true);
        int lastindex= findbound(nums,target,false);
        return new int[]{firstindex, lastindex};
    }
    public int findbound(int nums[], int target, boolean isleft){
        int st = 0;
        int end = nums.length-1;
        int index = -1;
        while( st<= end){
            int mid = st +(end -st)/2;
            if(nums[mid] == target){
                index = mid;
                if(isleft){
                    end = mid-1;
                }else{
                    st = mid+1;
                }
            }else if( nums[mid] <target){
                st = mid +1;
                
            }else{
                end = mid -1;
            }
        }return index;
    }
}
