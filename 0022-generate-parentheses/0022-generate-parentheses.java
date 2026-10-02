class Solution {
    public static void helper(int n,int open,int close,String comb,List<String> ans){
        if(n==open && n==close){
            ans.add(comb);
            return;
        }
        if(open<n){
           helper(n,open+1,close,comb+"(",ans);
        }
        if(open>close){
           helper(n,open,close+1,comb+")",ans);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        helper(n,0,0,"",ans);
        return ans;
    }
}