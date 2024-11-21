class Solution {
    public String reverseWords(String s) {
        String newstr=s.trim().replaceAll("\\s+", " ");
        String words[]=newstr.split(" ");
        String ans="";
        for(int i=words.length-1;i>0;i--){
            ans+=words[i]+" ";
        }
        ans+=words[0];
        return ans;
    }
}