class Solution {
    public int findJudge(int n, int[][] trust) {
        
        int inDeg[]= new int[n+1];
        int outDeg[]= new int[n+1];

        for(int  ele[]: trust){
        inDeg[ele[1]]++; 
        outDeg[ele[0]]++; 
        }
 
        for(int i=1 ;i<n+1; i++){
            if(outDeg[i]==0 && inDeg[i]==n-1) return i;
        }

        return -1;
    }
}