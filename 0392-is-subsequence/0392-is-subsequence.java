class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0){
            return true;
        }
        if(t.length()==0){
            return false;
        }
        Deque<Character> que=new LinkedList();
        for(int i=0;i<s.length();i++){
            que.add(s.charAt(i));
        }
        for(int i=0;i<t.length();i++){
            if(que.getFirst()==t.charAt(i)){
                que.removeFirst();
                if(que.isEmpty()){
                    break;
                }
            }
        }
        if(que.isEmpty()){
            return true;
        }
        return false;
    }
}