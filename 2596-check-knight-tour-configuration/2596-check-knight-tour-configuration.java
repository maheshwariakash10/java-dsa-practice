class Solution {
    public boolean checkValidGrid(int[][] grid) {
        if(grid[0][0]!=0) return false;
        return check(0, 0, 0, grid);
    }
    public boolean check(int x, int i, int j, int [][] grid){
        int n= grid.length;

        //base case ki aona last vlue tak pohoch agaye 
        if(x==n*n-1) return true;



        //  2up 1right  [i-2][j+1]
        if((i-2)>=0 && (j+1)<n && (x+1)== grid[i-2][j+1]){
            return check( x+1, i-2, j+1, grid);
        }

        // 2up  left  [i-2][j-1]
        else if( (i-2)>=0 && (j-1)>=0 && (x+1)== grid[i-2][j-1]){
            return check( x+1, i-2, j-1, grid);
        }

        //  2right 1up   [i-1][j+2]
        else if((i-1)>=0 && (j+2)<n && (x+1)== grid[i-1][j+2]){ 
            return check( x+1,i-1 ,j+2, grid);
        }
        

        // 2right 1down [i+1][j+2]
        else if((i+1)<n && (j+2)<n && (x+1)== grid[i+1][j+2]){ 
            return check( x+1,i+1 ,j+2, grid);
        }


        //  2down 1right  [i+2][j+1]
        if((i+2)<n && (j+1)<n && (x+1)== grid[i+2][j+1]){
            return check( x+1, i+2, j+1, grid);
        }

        // 2down  left  [i+2][j-1]
        else if( (i+2)<n && (j-1)>=0 && (x+1)== grid[i+2][j-1]){
            return check( x+1, i+2, j-1, grid);
        }

        //  2left 1up   [i-1][j-2]
        else if((i-1)>=0 && (j-2)>=0 && (x+1)== grid[i-1][j-2]){ 
            return check( x+1,i-1 ,j-2, grid);
        }
        

        // 2left 1down [i+1][j-2]
        else if((i+1)<n && (j-2)>=0 && (x+1)== grid[i+1][j-2]){ 
            return check( x+1,i+1 ,j-2, grid);
        }

        return false;
    }
}