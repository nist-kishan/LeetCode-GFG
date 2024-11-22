class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int maxfreq=0;
        int element=Integer.MIN_VALUE;
        for(int elm:nums){
            map.put(elm,map.getOrDefault(elm, 0)+1);
            if(maxfreq<map.get(elm)){
                int freq=map.get(elm);
                maxfreq=Math.max(freq,maxfreq);
                element=elm;
            }
        }
        return element;
    }
}