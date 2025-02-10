class Solution {
    public int SquareSum(int n){
        int sum=0;
        int rem=0;
        while(n!=0){
            rem=n%10;
            sum=sum+(rem*rem);
            n=n/10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        HashMap<Integer,Integer> sumOfSquare=new HashMap<>();
        int sum=0;
        while(n!=1){
            if(sumOfSquare.containsKey(n)){
                return false;
            }
            else{
                sum=SquareSum(n);
                sumOfSquare.put(n,sum);
                n=sum;
            }
        }
        return true;
    }
}