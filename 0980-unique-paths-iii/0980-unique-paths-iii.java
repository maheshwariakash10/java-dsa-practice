class Solution {
    public int uniquePathsIII(int[][] grid) {
        int row= grid.length;
        int col= grid[0].length;
        int count=0;
        int sr=-1;
        int er=-1;
        int ec=-1;
        int sc=-1;
        for(int i=0 ; i < row; i++){
            for(int j=0; j< col; j++){
                if(grid[i][j]!=-1) count++;
                 if( grid[i][j]==1){ sr=i; sc= j;}
                 if( grid[i][j]==1){ec= j; er=i;}
            }
        }
        return helper(sc,sr, ec, er, count, grid);


    }

    public int helper(int sc, int sr, int ec, int er, int count, int grid[][]){
        int row= grid.length;
        int col= grid[0].length;

        if(sr>= row|| sc>= col  || sr<0 || sc<0 ||grid[sr][sc]==-1  ) return 0;

        if(grid[sr][sc]==2) {
            if(count==1) return 1;
            else{
                return 0;
            }
        }
 

        grid[sr][sc]=-1;
        int right=helper(sc+1,sr, ec, er, count-1, grid);
        int down=helper(sc,sr+1, ec, er, count-1, grid);
        int up=helper(sc,sr-1, ec, er, count-1, grid);
        int left=helper(sc-1,sr, ec, er, count-1, grid);
        grid[sr][sc]=0;

        return right+left+down+up;

    }

}