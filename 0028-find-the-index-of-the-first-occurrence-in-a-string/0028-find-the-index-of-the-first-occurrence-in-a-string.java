class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.length()<needle.length()){
            return -1;
        }
        if(needle.isEmpty()){
            return 0;
        }
        int nlen=needle.length();
        int haylen=haystack.length();
        if(haylen==1){
            if(haystack.equals(needle));
            return 0;
        }
        for(int i=0;i<=haylen-nlen;i++){
            if(haystack.substring(i,i+nlen).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}