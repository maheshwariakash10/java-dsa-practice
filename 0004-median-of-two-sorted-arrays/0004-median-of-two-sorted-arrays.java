class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m= nums1.length;
        int n= nums2.length;

        int ans[]= new int[m+n];

        int idx=0;
        int i=0; int j=0;

        while(i< m && j< n){
            if(nums1[i]< nums2[j]){
                ans[idx]= nums1[i];
                i++;
            }
            else{
                ans[idx]= nums2[j];
                j++;
            }
            idx++;
        }

        if(i!=m){
            for(int x=i; x< m ;x++){
                ans[idx]= nums1[x];
                idx++;
            }
        }
        else if(j!= n){
            for(int x=j; x< n ;x++){
                ans[idx]= nums2[x];
                idx++;
            }
        }

        if(ans.length%2!= 0) return (double)ans[ans.length/2];

        return (double)(ans[(m+n)/2] + ans[(m+n)/2 - 1])/2;
    }
}