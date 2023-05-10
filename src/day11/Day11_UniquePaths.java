package day11;

public class Day11_UniquePaths {
    public int uniquePaths(int m, int n){
        int[][] up = new int[m][n];
        return countPaths(up,0,0,m,n);

    }

    private int countPaths(int[][] up, int mcurr, int ncurr, int m, int n){
        //when the mxn grid is 1 X 1, then there is only one path.
        if(mcurr==m-1 && ncurr == n-1){
            return 1;
        }
        // if currnt points are out of grid, return 0
        if(mcurr >= m || ncurr >= n){
            return 0;
        }
        if(up[mcurr][ncurr] != 0){
            return up[mcurr][ncurr];
        }
        // int up[mcurr][ncurr] will add up with every possible unique path. Using recurrence relation.
        up[mcurr][ncurr] = countPaths(up,mcurr+1, ncurr, m,n) + countPaths(up, mcurr, ncurr+1, m, n);

        return up[mcurr][ncurr];

    }

}
