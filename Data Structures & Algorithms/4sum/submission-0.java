class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0 ; i<n ;i++){
            if(i >0 && nums[i] == nums[i-1]) continue;

        for(int j = i+1; j<n;j++){
            if(j> i+1 && nums[j] == nums[j-1]) continue;

            int p = j+1 , q = n-1;
            while( p < q ){
                long sum = (long) nums[i] + nums[j] + nums[p] + nums[q];
                if(sum == target ){
                    res.add(Arrays.asList(nums[i], nums[j], nums[p], nums[q]));
                    p++;
                    q--;
                    while( p<q &&  nums[p] == nums[p-1]) p++;
                    while( p< q && nums[q] == nums[q+1]) q--;
                }else if(sum < target ){
                    p++;
                }else{
                    q--;
                }
            }
        }
        

    }
    return res;
}
}