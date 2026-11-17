class Solution {
    public boolean halvesAreAlike(String s) {
        int a=0;
        int b=0;
        int low=0;
        int high=s.length()-1;
        String vowel="aeiouAEIOU";

        while(low<high){
            char leftCh=s.charAt(low);
            if(vowel.indexOf(leftCh)!=-1) a++;

            char rightCh= s.charAt(high);
            if(vowel.indexOf(rightCh)!=-1) b++;


            low++;
            high--;
        }
        return a==b;
    }
}