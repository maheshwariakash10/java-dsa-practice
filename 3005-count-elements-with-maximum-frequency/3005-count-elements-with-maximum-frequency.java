class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer ,Integer> mp= new HashMap<>();

        for(int ele:nums){
            mp.put(ele, mp.getOrDefault(ele, 0)+1);
        }

        int mx=Integer.MIN_VALUE;

        for(int ele: mp.keySet()){
            mx= Math.max(mx,mp.get(ele));
        }
        int sum=0;
        for(int ele: mp.keySet()){
            if(mp.get(ele)==mx) sum+=mx;
        }
        return sum;
    }
}