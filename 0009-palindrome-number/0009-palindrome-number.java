class Solution {
    public boolean isPalindrome(int x) {
        StringBuilder num=new StringBuilder(String.valueOf(x));
        StringBuilder rev = new StringBuilder(num).reverse();
        if(num.toString().equals(rev.toString())){
            return true;
        }
        return false;
    }
}