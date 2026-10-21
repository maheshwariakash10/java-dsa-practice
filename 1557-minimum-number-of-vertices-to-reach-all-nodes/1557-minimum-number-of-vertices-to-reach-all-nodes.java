class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
     int[] indeg= new int[n];

     for(List<Integer> li: edges){
        indeg[li.get(1)]++;
     }

     List<Integer> li= new ArrayList<>();
     for(int i=0; i< n; i++){
        if(indeg[i]==0) li.add(i);
     }
     return li;

    }
}