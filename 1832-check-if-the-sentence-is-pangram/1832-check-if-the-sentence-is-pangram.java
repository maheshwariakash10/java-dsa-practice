class Solution {
    public boolean checkIfPangram(String sentence) {
        String a="qwertyuiopasdfghjklzxcvbnm";
        for(int i=0 ;i< a.length();i++){
            char ch= a.charAt(i);

            if(sentence.indexOf(ch)==-1) return false;
        }
        return true;
        
    }
}