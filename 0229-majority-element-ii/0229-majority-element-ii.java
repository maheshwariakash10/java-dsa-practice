class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> mp= new HashMap<>();
        int n= nums.length;
        
        for(int i=0 ;i< nums.length; i++){
            int a= nums[i];
            mp.put(a, mp.getOrDefault(a,0)+1);
        }

        ArrayList<Integer> li= new ArrayList<>();

        for(int a : mp.keySet()){
            if(mp.get(a)> n/3 )  li.add(a);
        }
        return li;
    }
}