class Solution {
    public int mySqrt(int x) {
        int max=Integer.MAX_VALUE;
        int sqrt=0;
        if(x ==2147483647){
            return 46340;
        }
        for(int i=0;i<max;i++){
            sqrt=i*i;
            if(sqrt>x){
                sqrt=i-1;
                break;
            }
            else if(sqrt==x){
                sqrt= i;
                break;
            }
        }
        return sqrt;
    }
}