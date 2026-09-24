class Solution {
    public static int sumOfDigit(int num){
        if(num<=9) return num;
        int sum=0;
        while(num!=0){
            sum=sum+(num%10);
            num/=10;
        }
        return sum;
    }
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(sumOfDigit(nums[i])==i){
                return i;
            }
        }
        return -1;
    }
}