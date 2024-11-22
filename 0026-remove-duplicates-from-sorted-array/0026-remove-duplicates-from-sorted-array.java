class Solution {
    public int removeDuplicates(int[] nums) {
        LinkedHashSet<Integer> h=new LinkedHashSet<>();
        for(int i:nums){
            h.add(i);
        }
        int i=0;
        Iterator<Integer> it = h.iterator();
        while(it.hasNext()){
            int temp=(int)it.next();
            nums[i]=temp;
            i++;
        }
        int len=h.size();
        return len;
    }
}