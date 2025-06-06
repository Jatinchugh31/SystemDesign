package src.dataStructure.tree.binary;

public class NumberOfIsLandTest {

    public  static void main(String[] args) {
        Solution solution = new Solution();
        char[][] grid = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };
        System.out.println(solution.numIslands(grid));
    }
}



class Solution {
    public int numIslands(char[][] grid) {
        if(grid == null || grid.length ==0){
            return 0;
        }

        int numsOfIsLand = 0;

        for(int i=0 ; i < grid.length;i++){
            for(int j =0 ; j < grid[0].length ;j++){
                if(grid[i][j] == '1'){
                    numsOfIsLand++;
                    dfs(grid, i, j);
                }
            }
        }
        return numsOfIsLand;
    }

    public  void dfs(char[][] grid, int i , int j ){
        if(i < 0 || i >= grid.length  || j <0 || j >= grid[0].length || grid[i][j] =='0' ){
            return ;
        }

        grid[i][j] ='0';
        dfs(grid,i+1,j);
        dfs(grid,i-1,j);
        dfs(grid,i ,j +1);
        dfs(grid,i,j-1);
    }
}