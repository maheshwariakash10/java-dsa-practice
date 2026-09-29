class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int  low= 0;
        int high=  matrix[0].length-1;

        int row= rowFind(matrix, target);
        if(row==-1) return false;


             while(low<= high){
                int mid= (low+ high) /2;

                if(matrix[row][mid]== target) return true;
                else if( matrix[row][mid]> target) high= mid-1;
                else{
                    low= mid+1;
                }
             }

        return false;        
    }

    public int rowFind(int[][]matrix,int target){

        int low= 0;
        int high= matrix.length-1;

        while(low<=high){
            int mid= (low+ high)/2;

            if( matrix[mid][0]== target) return mid;
            else if(matrix[mid][0]> target) high= mid-1;
            else{
                   low= mid+1;
               }
        }
        return high;
    }
}