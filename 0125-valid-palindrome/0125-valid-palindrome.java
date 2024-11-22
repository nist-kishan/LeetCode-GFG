class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        StringBuilder str=new StringBuilder(s);
        str=str.reverse();
        if(s.equals(str.toString())){
            return true;
        }
        else{
            return false;
        }
    }
}