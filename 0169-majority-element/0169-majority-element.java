class Solution {
    public int majorityElement(int[] nums) {
        int count=1;
        int elm=nums[0];
        for(int i=1;i<nums.length;i++){
            // if(elm==nums[i]){
            //     count++;
            // }else{
            //     count--;
            //     if(count==0){
            //         elm=nums[i];
            //         count=1;
            //     }
            // }

            //shorter version
            if(count==0){
                elm=nums[i];
            }
            count+=(nums[i]==elm)?1:-1;
        }

        //confirmation of that element
        count=0;
        for(int i=0;i<nums.length;i++){
            if(elm==nums[i]){
                count++;
            }
        }

        return (nums.length/2)<count?elm:-1;
    }
}