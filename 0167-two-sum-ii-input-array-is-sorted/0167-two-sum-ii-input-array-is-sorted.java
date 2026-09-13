class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            if(map.containsKey(target-numbers[i])){
                int num1=map.get(target-numbers[i]);
                return new int[]{num1,i+1};
            }
            map.put(numbers[i],map.getOrDefault(numbers[i],i+1));
        }
        return new int[]{-1,-1};
    }
}