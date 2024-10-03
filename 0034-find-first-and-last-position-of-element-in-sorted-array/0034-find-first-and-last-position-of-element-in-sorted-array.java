class Solution {
    public int firstOccurence(int []nums,int target){
        int start=0,end=nums.length-1;
        int index=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                end=mid-1;
                index=mid;
            }
            else if(nums[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return index;
    }

    public int lastOccurence(int []nums,int target){
        int start=0,end=nums.length-1;
        int index=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                start=mid+1;
                index=mid;
            }
            else if(nums[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return index;
    }
    public int[] searchRange(int[] nums, int target) {
        int arr[]=new int[2];
        arr[0]=firstOccurence(nums,target);
        arr[1]=lastOccurence(nums,target);
        return arr;
    }
}