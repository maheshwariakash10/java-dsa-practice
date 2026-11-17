class Solution {
    public boolean hasAlternatingBits(int n) {
        int pre=-1;
        while(n!=0){
            int rem=n%2;
            if(rem==pre) return false;
            pre=rem;
            n=n/2;
        }
        return true;
        
    }
}