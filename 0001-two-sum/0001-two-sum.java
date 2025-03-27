class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            int remain=target-nums[i];
            for(int j=0;j<nums.length;j++){
                if(remain==nums[j] && i!=j){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }
}