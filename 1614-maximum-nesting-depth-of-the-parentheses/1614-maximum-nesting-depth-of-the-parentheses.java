class Solution {
    public int maxDepth(String s) {
        int maxi=0;
        Stack<Character>  st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='('){
                st.push('(');
            }else if(ch==')'){
                st.pop();
            }
            maxi=Math.max(maxi,st.size());
        }

        return maxi;
    }
}