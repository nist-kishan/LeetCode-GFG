class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int ans[]=new int[seq.length()];
        int depth=1;
        int index=0;

        for(char ch:seq.toCharArray()){
            if(ch=='('){
                depth++;
                ans[index++]=depth%2;
            }else{
                ans[index++]=depth%2;
                depth--;
            }
        }

        return ans;
    }
}