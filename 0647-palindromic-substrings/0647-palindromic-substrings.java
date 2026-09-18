class Solution {
    public int countSubstrings(String s) {
        int n=  s.length();

        int count=0;


        for(int i=0 ; i< n ;i++){
            int lo= i ;
            int hi= i;

            while(lo>=0 && hi< n && s.charAt(lo)== s.charAt(hi) ){
                lo--;
                hi++;
                count++;
            }


            lo= i ;
            hi= i+1;

            while(lo>=0 && hi< n && s.charAt(lo)== s.charAt(hi) ){
                lo--;
                hi++;
                count++;
            }
        }
        return count;
        
    }
}