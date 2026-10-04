class Solution {
    public int maximum69Number (int num) {
        int temp=num;
        int position=-1;
        int digit=0;


        while(temp>0){
            int rem= temp%10;

            
            if(rem==6) position= digit;
            digit++;
            temp= temp/10;
        }

        return num+(int)(3*Math.pow(10, position));
        
    }
}