class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int[] ans = new int[n];

        for(int i=0; i<n; i++){
            for(int j=0; j<nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    int k = j;
                    while(k < nums2.length){
                        if(nums2[k] > nums2[j]){
                            ans[i] = nums2[k];
                            break;
                        }
                        else{
                            ans[i] = -1;
                        }
                        k++;
                    }
                }
            }
        }
        return ans;
    }
}