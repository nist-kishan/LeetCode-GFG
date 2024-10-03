class Solution {
    public int maxSubArray(int[] nums) {
        int localsum=nums[0];
        int globasum=nums[0];
        for(int i=1;i<nums.length;i++){
            localsum=Math.max(nums[i],nums[i]+localsum);
            if(localsum>globasum){
                globasum=localsum;
            }
        }
        return globasum;
    }
}