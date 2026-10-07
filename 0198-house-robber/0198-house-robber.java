class Solution {
    public int rob(int[] nums) {
        int n= nums.length;

        int arr[]= new int[n];

        arr[0]= nums[0];
         if(n==1) return nums[0];
        arr[1]= Math.max(nums[0], nums[1]);

        for(int i=2; i< n; i++){
            int a=arr[i-1];
            int b= arr[i-2]+nums[i];
            arr[i]=Math.max(a,b);
        }

        return arr[n-1];

        
    }
}