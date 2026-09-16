class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int len=grid.length;
        int maxVal=len*len;

        int ans[]=new int[2];

        int isPresent[]=new int[maxVal];

        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                isPresent[grid[i][j]-1]++;
            }
        }

        for(int i=0;i<maxVal;i++){
            if(isPresent[i]==0){
                ans[1]=i+1;
            }

            if(isPresent[i]==2){
                ans[0]=i+1;
            }
        }

        return ans;
    }
}