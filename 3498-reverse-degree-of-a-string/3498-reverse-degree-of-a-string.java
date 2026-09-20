class Solution {
    public int reverseDegree(String s) {
        int ans=0;
        int i=1;
        for(char ch:s.toCharArray()){
            int pos=ch-'a';
            int rev=26-pos;
            int prod=i*rev;
            ans+=prod;
            i++;
        }
        return ans;
    }
}