class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length== 0 || nums.length==1) return nums.length;

        int i=0;
        int j=1;
        int idx=1;
        int count=1;
        

        while(j<nums.length){
            if(nums[i]!= nums[j]){
                count++;
                nums[idx]=nums[j];
                idx++;
            }
            i++;
            j++;

        }

           
        
        return count;
        
    }
}