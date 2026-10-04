class Solution {
    public int minRotations(String s) {
        int totalcount=0;
        int pre= 0;

        for(int i=0 ; i< s.length(); i++){
            int target= s.charAt(i)-'0';

            int forward=Math.abs(target-pre);

            int backward= 10- forward; // beacuse you are having total 10position and forwad gaye tho back ward ke liye 10 - forward tho piche ka malum chal jata he
            

            totalcount+=Math.min(forward, backward);
            
            pre= target;
        }
        
        return totalcount;
    }
}

// // forward = |2 - 9| = 7

// backward = 9 + (10 - 2)
//          = 9 + 8
//          = 17