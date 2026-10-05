class Solution {
    public boolean isPalindrome(String s) {
        
        String x= "";

        String sample="abcdefghijjklmnopqrstuvwxyz0123456789";
        for(int i = 0; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));
            if(sample.indexOf(ch) != -1){
                x=x+ch;
            }
        }


        int low= 0;int high= x.length()-1;

        while(low<= high){
            if(x.charAt(low)!= x.charAt(high)) return false;
            low++;
            high--;
        }

        return true;
    }
}