class Solution {
    public int removeDuplicates(int[] nums) {
        int temp=Integer.MIN_VALUE;
        int index=0,count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=temp){
                temp=nums[i];
                nums[index]=temp;
                index++;
                count=1;
            }
            else if(nums[i]==temp && count==1){
                temp=nums[i];
                nums[index]=temp;
                index++;
                count++;
            }
        }
        return nums.length-(nums.length-index);
    }
}