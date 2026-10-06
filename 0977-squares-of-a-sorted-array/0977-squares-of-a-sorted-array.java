class Solution {
    public int[] sortedSquares(int[] nums) {
        int low= 0;
        int high= nums.length-1;
        int idx= high;

        int arr[]= new int[high+1];

        while(low<= high){
            int a= nums[low]* nums[low];
            int b= nums[high]*nums[high];

            arr[idx]= Math.max(a,b);
            idx--;

            if(a<b){
                high--;
            }
            else{
                low++;
            }
        }

        return arr;

    }
}